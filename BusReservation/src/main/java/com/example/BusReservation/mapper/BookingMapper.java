package com.example.BusReservation.mapper;

import com.example.BusReservation.dto.BookingDTO;
import com.example.BusReservation.entity.Booking;
import com.example.BusReservation.entity.Bus;
import com.example.BusReservation.entity.User;
import org.springframework.stereotype.Component;

@Component
public class BookingMapper {

    public BookingDTO toDTO(Booking booking) {
        BookingDTO bookingDTO = new BookingDTO();
        bookingDTO.setBookingId(booking.getBookingId());
        bookingDTO.setUserId(booking.getUser().getUserId());
        bookingDTO.setBusId(booking.getBus().getBusId());
        bookingDTO.setBookingDate(booking.getBookingDate());
        bookingDTO.setStatus(booking.getStatus());
        bookingDTO.setTotalPrice(booking.getTotalPrice());
        return bookingDTO;
    }

    public Booking toEntity(BookingDTO bookingDTO) {
        Booking booking = new Booking();
        // Assume setters for entity are defined in Booking class
        booking.setBookingId(bookingDTO.getBookingId());
        // Assuming User and Bus entities are fetched and set appropriately
        booking.setUser(new User(bookingDTO.getUserId()));
        booking.setBus(new Bus(bookingDTO.getBusId()));
        booking.setBookingDate(bookingDTO.getBookingDate());
        booking.setStatus(bookingDTO.getStatus());
        booking.setTotalPrice(bookingDTO.getTotalPrice());
        return booking;
    }
}
