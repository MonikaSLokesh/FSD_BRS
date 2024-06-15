// BookingPage.js
import React from 'react';
import BusList from '../components/BusList';
import BookingForm from '../components/BookingForm';

const BookingPage = () => {
  return (
    <div className="container">
      <h2>Book Ticket</h2>
      <BookingForm />
      <hr />
      <h3>Available Bus Routes</h3>
      <BusList />
    </div>
  );
};

export default BookingPage;
