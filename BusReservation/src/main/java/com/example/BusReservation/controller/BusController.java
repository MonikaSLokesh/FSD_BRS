package com.example.BusReservation.controller;

import com.example.BusReservation.dto.BusDto;
import com.example.BusReservation.dto.UserDto;
import com.example.BusReservation.repository.BusRepository;
import com.example.BusReservation.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/bus")
public class BusController {

    @Autowired
    BusService busService;

    @Autowired
    BusRepository busRepository;

    // Build Add Bus REST API
    @PostMapping("/new")
    public ResponseEntity<BusDto> createUser(@RequestBody BusDto busDto){
        BusDto savedBus = busService.createBus(busDto);
        return new ResponseEntity<>(savedBus, HttpStatus.CREATED);
    }

    //Build Search Bus with source and destination
    @GetMapping("/search")
    public ResponseEntity<List<BusDto>> getBusesBySourceAndDestination(
            @RequestParam String source,
            @RequestParam String destination) {

        List<BusDto> busDtos = busService.getBySrcDest(source, destination);

        if (busDtos.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(busDtos, HttpStatus.OK);
    }

    // Build Delete Bus REST API
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long busId){
        busService.deleteBus(busId);
        return ResponseEntity.ok("User deleted successfully!.");
    }
}
