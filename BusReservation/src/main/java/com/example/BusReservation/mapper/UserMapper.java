package com.example.BusReservation.mapper;

import com.example.BusReservation.dto.UserDto;
import com.example.BusReservation.entity.User;

public class UserMapper {


    public static UserDto mapToUserDto(User user){
        return new UserDto(
                user.getUserId(),
                user.getUserName(),
                user.getUserMail(),
                user.getUserPwd(),
                user.getUserPayMode()
        );

    }

    public static User mapToUser(UserDto userDto){
        return new User(
                userDto.getUserId(),
                userDto.getUserName(),
                userDto.getUserMail(),
                userDto.getUserPwd(),
                userDto.getUserPayMode()
        );
    }
}
