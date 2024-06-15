package com.example.BusReservation.controller;

import com.example.BusReservation.dto.UserDto;
import com.example.BusReservation.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    // Build Add User REST API
    @PostMapping("/new")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
        UserDto savedUser = userService.createUser(userDto);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    // Build Get User REST API
    @GetMapping("{id}/view")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long userId){
        UserDto userDto = userService.getUserById(userId);
        return ResponseEntity.ok(userDto);
    }

    // Build Get All Users REST API
    @GetMapping ("/allUser")
    public ResponseEntity<List<UserDto>> getAllUser(){
        List<UserDto> users = userService.getAllUser();
        return ResponseEntity.ok(users);
    }

    // Build Update User Details REST API
    @PutMapping("/{id}/updateUser")
    public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long userId,
                                              @RequestBody String  updatedName , String updatedMail){
        UserDto userDto = userService.updateUserDetails(userId, updatedName,updatedMail);
        return ResponseEntity.ok(userDto);
    }

    // Build Update User Password REST API
    @PutMapping("{id}/updatePwd/")
    public ResponseEntity<UserDto> updatePwd(@PathVariable("id") Long userId,
                                              @RequestBody String updatedPwd){
        UserDto userDto = userService.updatePwd(userId, updatedPwd );
        return ResponseEntity.ok(userDto);
    }

    // Build Update User REST API
    @PutMapping("{id}/updatePayMode/")
    public ResponseEntity<UserDto> updatePayMode(@PathVariable("id") Long userId,
                                              @RequestBody String updatedPayMode){
        UserDto userDto = userService.updatePayMode(userId, updatedPayMode);
        return ResponseEntity.ok(userDto);
    }

    // Build Delete User REST API
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
        userService.deleteUser(userId);
        return ResponseEntity.ok("User deleted successfully!.");
    }
}