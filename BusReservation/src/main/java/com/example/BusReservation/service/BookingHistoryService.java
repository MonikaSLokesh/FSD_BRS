package com.example.BusReservation.service;

import com.example.BusReservation.dto.BookingHistoryDTO;
import com.example.BusReservation.entity.BookingHistory;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface BookingHistoryService {

    BookingHistoryDTO createBookingHistory(BookingHistoryDTO bookingHistoryDTO);

    List<BookingHistoryDTO> listBookingHistoryByUserId(Long userId);

    List<BookingHistory> getBookingHistoryByUserId(@RequestParam Long userId);

}
