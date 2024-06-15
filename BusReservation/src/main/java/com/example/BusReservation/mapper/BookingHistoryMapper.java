package com.example.BusReservation.mapper;

import com.example.BusReservation.dto.BookingHistoryDTO;
import com.example.BusReservation.entity.BookingHistory;
import org.springframework.stereotype.Component;

@Component
public class BookingHistoryMapper {

    public BookingHistoryDTO toDTO(BookingHistory bookingHistory) {
        BookingHistoryDTO bookingHistoryDTO = new BookingHistoryDTO(
                bookingHistory.getBookingHistoryId(),
                bookingHistory.getUser().getUserId(),
                bookingHistory.getBus().getBusId(),
                bookingHistory.getBooking().getBookingId(),
                bookingHistory.getBookingDate(),
                bookingHistory.getStatus(),
                bookingHistory.getTotalPrice()
        );
        return bookingHistoryDTO;
    }

    public BookingHistory toEntity(BookingHistoryDTO bookingHistoryDTO) {
        BookingHistory bookingHistory = new BookingHistory();
        bookingHistory.setBookingDate(bookingHistoryDTO.getBookingDate());
        bookingHistory.setStatus(bookingHistoryDTO.getStatus());
        bookingHistory.setTotalPrice(bookingHistoryDTO.getTotalPrice());
        return bookingHistory;
    }
}
