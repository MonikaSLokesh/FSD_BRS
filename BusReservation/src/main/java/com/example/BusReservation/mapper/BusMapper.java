package com.example.BusReservation.mapper;

import com.example.BusReservation.dto.BusDto;
import com.example.BusReservation.dto.UserDto;
import com.example.BusReservation.entity.Bus;
import com.example.BusReservation.entity.User;

public class BusMapper {

    public static BusDto mapToBusDto(Bus bus){
        return new BusDto(
                bus.getBusId(),
                bus.getBusName(),
                bus.getBusNo(),
                bus.getSource(),
                bus.getDestination(),
                bus.getAvailable_date(),
                bus.getArrival_time(),
                bus.getDeparture_time(),
                bus.getPrice()
        );
    }


    public static Bus mapToBus(BusDto busDto){
        return new Bus(
                busDto.getBusId(),
                busDto.getBusName(),
                busDto.getBusNo(),
                busDto.getSource(),
                busDto.getDestination(),
                busDto.getAvailable_date(),
                busDto.getArrival_time(),
                busDto.getDeparture_time(),
                busDto.getPrice()

        );
    }
}
