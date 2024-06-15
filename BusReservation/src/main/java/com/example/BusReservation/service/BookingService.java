package com.example.BusReservation.service;

import com.example.BusReservation.dto.BookingDTO;
import com.example.BusReservation.entity.Booking;

import java.util.List;

public interface BookingService {

    BookingDTO createBooking(BookingDTO bookingDTO);

    void deleteBooking(Long bookingId);

    List<Booking> getBookingsByUserId(Long userId);

    List<BookingDTO> listBookingsByUserId(Long userId);

}