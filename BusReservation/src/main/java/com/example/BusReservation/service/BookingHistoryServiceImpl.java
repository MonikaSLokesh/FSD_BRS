package com.example.BusReservation.service;

import com.example.BusReservation.dto.BookingHistoryDTO;
import com.example.BusReservation.entity.BookingHistory;
import com.example.BusReservation.mapper.BookingHistoryMapper;
import com.example.BusReservation.repository.BookingHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookingHistoryServiceImpl implements BookingHistoryService {

    @Autowired
    private BookingHistoryRepository bookingHistoryRepository;

    @Autowired
    private BookingHistoryMapper bookingHistoryMapper;

    @Override
    public BookingHistoryDTO createBookingHistory(BookingHistoryDTO bookingHistoryDTO) {
        BookingHistory bookingHistory = bookingHistoryMapper.toEntity(bookingHistoryDTO);
        BookingHistory savedBookingHistory = bookingHistoryRepository.save(bookingHistory);
        return bookingHistoryMapper.toDTO(savedBookingHistory);
    }

    @Override
    public List<BookingHistoryDTO> listBookingHistoryByUserId(Long userId) {
        List<BookingHistory> bookingHistories = bookingHistoryRepository.findByUserUserId(userId);
        return bookingHistories.stream()
                .map(bookingHistoryMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<BookingHistory> getBookingHistoryByUserId(Long userId) {
        return bookingHistoryRepository.findByUserUserId(userId);
    }

}
