package com.example.BusReservation.dto;

import jakarta.persistence.*;

public class BusDto {
    private Long busId;
    private String busName;
    private String busNo;
    private String source;
    private String destination;
    private String available_date;
    private String arrival_time;
    private String departure_time;
    private Double price;

    public BusDto(Long busId, String busName, String busNo, String source, String destination, String available_date, String arrival_time, String departure_time, Double price) {
        this.busId = busId;
        this.busName = busName;
        this.busNo = busNo;
        this.source = source;
        this.destination = destination;
        this.available_date = available_date;
        this.arrival_time = arrival_time;
        this.departure_time = departure_time;
        this.price = price;
    }

    public Long getBusId() {
        return busId;
    }

    public void setBusId(Long busId) {
        this.busId = busId;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAvailable_date() {
        return available_date;
    }

    public void setAvailable_date(String available_date) {
        this.available_date = available_date;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}