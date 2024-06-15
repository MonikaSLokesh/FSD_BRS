import axios from 'axios';

const API_URL = 'http://localhost:8080/api'; // Replace with your backend URL

const axiosInstance = axios.create({
  baseURL: API_URL,
  headers: {
    'Content-Type': 'application/json',
  },
});

export default axiosInstance;
