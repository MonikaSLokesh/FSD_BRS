package com.example.BusReservation.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BookingDTO {

    private Long bookingId;
    private Long userId;
    private Long busId;
    private LocalDateTime bookingDate;
    private String status;
    private BigDecimal totalPrice;

    public BookingDTO() {
        
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
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

    public BookingDTO(Long bookingId, Long userId, Long busId, LocalDateTime bookingDate, String status, BigDecimal totalPrice) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.busId = busId;
        this.bookingDate = bookingDate;
        this.status = status;
        this.totalPrice = totalPrice;
    }
}
