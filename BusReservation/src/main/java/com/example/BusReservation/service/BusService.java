package com.example.BusReservation.service;

import com.example.BusReservation.dto.BusDto;
import com.example.BusReservation.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BusService {


    //create bus
    BusDto createBus(BusDto busDto);

    //delete bus
    void deleteBus(Long busId);

    //get bus by source and destination
    List<BusDto> getBySrcDest(String source , String destination);

}
