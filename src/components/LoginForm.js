// LoginForm.js
import React, { useState,useHistory } from 'react';

import axiosInstance from '../services/apiService';

const LoginForm = () => {
  const [credentials, setCredentials] = useState({ email: '', password: '' });
  const history = useHistory();

  const handleLogin = async (e) => {
    e.preventDefault();
    try {
      const response = await axiosInstance.post('/auth/login', credentials);
      localStorage.setItem('token', response.data.token);
      history.push('/profile'); // Redirect to profile page after successful login
    } catch (error) {
      console.error('Login error: ', error);
    }
  };

  return (
    <div className="container">
      <h2>Login</h2>
      <form onSubmit={handleLogin}>
        <div className="form-group">
          <label>Email:</label>
          <input type="email" className="form-control" value={credentials.email} onChange={(e) => setCredentials({ ...credentials, email: e.target.value })} required />
        </div>
        <div className="form-group">
          <label>Password:</label>
          <input type="password" className="form-control" value={credentials.password} onChange={(e) => setCredentials({ ...credentials, password: e.target.value })} required />
        </div>
        <button type="submit" className="btn btn-primary">Login</button>
      </form>
    </div>
  );
};

export default LoginForm;
