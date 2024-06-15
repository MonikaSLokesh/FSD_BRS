package com.example.BusReservation.controller;

import com.example.BusReservation.dto.BookingDTO;
import com.example.BusReservation.entity.Booking;
import com.example.BusReservation.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public ResponseEntity<BookingDTO> createBooking(@RequestBody BookingDTO bookingDTO) {
        BookingDTO createdBooking = bookingService.createBooking(bookingDTO);
        return ResponseEntity.ok(createdBooking);
    }

    @DeleteMapping("/{bookingId}")
    public ResponseEntity<Void> deleteBooking(@PathVariable Long bookingId) {
        bookingService.deleteBooking(bookingId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/bookings")
    public List<Booking> getBookingsByUserId(@RequestParam Long userId) {
        return bookingService.getBookingsByUserId(userId);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<BookingDTO>> listBookingsByUserId(@PathVariable Long userId) {
        List<BookingDTO> bookings = bookingService.listBookingsByUserId(userId);
        return ResponseEntity.ok(bookings);
    }
}
