// NavBar.js
import React from 'react';
import { Link } from 'react-router-dom';

const NavBar = () => {
  return (
    <nav className="navbar navbar-expand-lg navbar-light bg-light">
      <div className="container">
        <Link className="navbar-brand" to="/">Bus Ticket Booking App</Link>
        <div className="collapse navbar-collapse">
          <ul className="navbar-nav mr-auto">
            <li className="nav-item">
              <Link className="nav-link" to="/booking">Book Ticket</Link>
            </li>
            <li className="nav-item">
              <Link className="nav-link" to="/profile">Profile</Link>
            </li>
          </ul>
          <ul className="navbar-nav ml-auto">
            <li className="nav-item">
              <Link className="nav-link" to="/login">Login</Link>
            </li>
            <li className="nav-item">
              <Link className="nav-link" to="/register">Register</Link>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  );
};

export default NavBar;
