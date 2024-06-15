package com.example.BusReservation.service;

import com.example.BusReservation.dto.BusDto;
import com.example.BusReservation.dto.UserDto;
import com.example.BusReservation.entity.Bus;
import com.example.BusReservation.entity.User;
import com.example.BusReservation.mapper.BusMapper;
import com.example.BusReservation.mapper.UserMapper;
import com.example.BusReservation.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BusServiceImpl implements BusService{

    @Autowired
    BusRepository busRepository;

    @Override
    public BusDto createBus(BusDto busDto) {
        Bus bus = BusMapper.mapToBus(busDto);
        Bus savedBus = busRepository.save(bus);
        return BusMapper.mapToBusDto(savedBus);
    }

    @Override
    public void deleteBus(Long busId) {
    busRepository.deleteById(busId);
    }

    @Override
    public List<BusDto> getBySrcDest(String source, String destination) {

        List<Bus> buses = busRepository.findBySourceAndDestination(source, destination);

        return buses.stream()
                .map(BusMapper::mapToBusDto)
                .collect(Collectors.toList());
    }

}
