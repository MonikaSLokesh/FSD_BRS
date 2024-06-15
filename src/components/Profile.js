// Profile.js
import React, { useState, useEffect } from 'react';
import axiosInstance from '../services/apiService';

const Profile = () => {
  const [user, setUser] = useState({});
  const [updatedPassword, setUpdatedPassword] = useState('');

  useEffect(() => {
    const fetchUserData = async () => {
      try {
        const response = await axiosInstance.get('/user/profile');
        setUser(response.data);
      } catch (error) {
        console.error('Error fetching user profile: ', error);
      }
    };
    fetchUserData();
  }, []);

  const handleUpdatePassword = async () => {
    try {
      await axiosInstance.put('/user/updatePassword', { newPassword: updatedPassword });
      alert('Password updated successfully!');
    } catch (error) {
      console.error('Error updating password: ', error);
    }
  };

  return (
    <div className="container">
      <h2>Profile</h2>
      <div>
        <p><strong>Name:</strong> {user.name}</p>
        <p><strong>Email:</strong> {user.email}</p>
      </div>
      <div className="form-group">
        <label>Update Password:</label>
        <input type="password" className="form-control" value={updatedPassword} onChange={(e) => setUpdatedPassword(e.target.value)} required />
      </div>
      <button className="btn btn-primary" onClick={handleUpdatePassword}>Update Password</button>
    </div>
  );
};

export default Profile;
