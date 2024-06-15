package com.example.BusReservation.controller;

import com.example.BusReservation.dto.BookingHistoryDTO;
import com.example.BusReservation.entity.BookingHistory;
import com.example.BusReservation.service.BookingHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/booking-history")
public class BookingHistoryController {

    @Autowired
    private BookingHistoryService bookingHistoryService;

    @PostMapping
    public ResponseEntity<BookingHistoryDTO> createBookingHistory(@RequestBody BookingHistoryDTO bookingHistoryDTO) {
        BookingHistoryDTO createdBookingHistory = bookingHistoryService.createBookingHistory(bookingHistoryDTO);
        return ResponseEntity.ok(createdBookingHistory);
    }

    @GetMapping("/booking-history")
    public List<BookingHistory> getBookingHistoryByUserId(@RequestParam Long userId) {
        return bookingHistoryService.getBookingHistoryByUserId(userId);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<BookingHistoryDTO>> listBookingHistoryByUserId(@PathVariable Long userId) {
        List<BookingHistoryDTO> bookingHistories = bookingHistoryService.listBookingHistoryByUserId(userId);
        return ResponseEntity.ok(bookingHistories);
    }

    // Additional CRUD endpoints can be added as needed
}
