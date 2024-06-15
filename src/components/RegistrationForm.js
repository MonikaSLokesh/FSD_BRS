// RegistrationForm.js
import React, { useState, useHistory } from 'react';
import axiosInstance from '../services/apiService';

const RegistrationForm = () => {
  const [user, setUser] = useState({ name: '', email: '', password: '' });
  const history = useHistory();

  const handleRegister = async (e) => {
    e.preventDefault();
    try {
      await axiosInstance.post('/register', user);
      history.push('/login'); // Redirect to login page after successful registration
    } catch (error) {
      console.error('Registration error: ', error);
    }
  };

  return (
    <div className="container">
      <h2>Register</h2>
      <form onSubmit={handleRegister}>
        <div className="form-group">
          <label>Name:</label>
          <input type="text" className="form-control" value={user.name} onChange={(e) => setUser({ ...user, name: e.target.value })} required />
        </div>
        <div className="form-group">
          <label>Email:</label>
          <input type="email" className="form-control" value={user.email} onChange={(e) => setUser({ ...user, email: e.target.value })} required />
        </div>
        <div className="form-group">
          <label>Password:</label>
          <input type="password" className="form-control" value={user.password} onChange={(e) => setUser({ ...user, password: e.target.value })} required />
        </div>
        <button type="submit" className="btn btn-primary">Register</button>
      </form>
    </div>
  );
};

export default RegistrationForm;
