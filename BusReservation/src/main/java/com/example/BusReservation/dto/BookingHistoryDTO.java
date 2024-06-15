package com.example.BusReservation.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BookingHistoryDTO {

    private Long bookingHistoryId;
    private Long userId;
    private Long busId;
    private Long bookingId;
    private LocalDateTime bookingDate;
    private String status;
    private BigDecimal totalPrice;

    public BookingHistoryDTO(Long bookingHistoryId, Long userId, Long busId, Long bookingId, LocalDateTime bookingDate, String status, BigDecimal totalPrice) {
        this.bookingHistoryId = bookingHistoryId;
        this.userId = userId;
        this.busId = busId;
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.status = status;
        this.totalPrice = totalPrice;
    }

    public Long getBookingHistoryId() {
        return bookingHistoryId;
    }

    public void setBookingHistoryId(Long bookingHistoryId) {
        this.bookingHistoryId = bookingHistoryId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBusId() {
        return busId;
    }

    public void setBusId(Long busId) {
        this.busId = busId;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
