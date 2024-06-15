package com.example.BusReservation.service;

import com.example.BusReservation.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {


    //create user
    UserDto createUser(UserDto userDto);

    //get user by id
    UserDto getUserById(Long userId);

    //get all user
    List<UserDto> getAllUser();

    //update userDetails(edit by id)
    UserDto updateUserDetails(Long userId, String userName , String userMail);

    //Manage password
    UserDto updatePwd(Long userId, String userPwd);

    //Manage Payment method
    UserDto updatePayMode(Long userId, String userPayMode);

    //delete user
    void deleteUser(Long userId);
}
