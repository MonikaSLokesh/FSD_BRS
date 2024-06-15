package com.example.BusReservation.service;

import com.example.BusReservation.dto.UserDto;
import com.example.BusReservation.entity.User;
import com.example.BusReservation.exception.ResourceNotFoundException;
import com.example.BusReservation.mapper.UserMapper;
import com.example.BusReservation.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {

            User user = UserMapper.mapToUser(userDto);
            User savedUser = userRepository.save(user);
            return UserMapper.mapToUserDto(savedUser);
    }

    @Override
    public UserDto getUserById(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User does not exist with the given id: " + userId));
        return UserMapper.mapToUserDto(user);
    }

    @Override
    public List<UserDto> getAllUser() {
        List<User> users = userRepository.findAll();
        return users.stream().map((user) -> UserMapper.mapToUserDto(user))
                .collect(Collectors.toList());
    }

    @Override
    public UserDto updateUserDetails(Long userId, String updatedName, String updatedMail) {

        User user = userRepository.findById(userId).orElseThrow(
                () -> new ResourceNotFoundException("User does not exist with the given id: " + userId)
        );

        user.setUserName(updatedName);
        user.setUserMail(updatedMail);

        User updatedUserObj = userRepository.save(user);

        return UserMapper.mapToUserDto(updatedUserObj);
    }

    @Override
    public UserDto updatePwd(Long userId, String updatedPwd) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new ResourceNotFoundException("User does not exist with the given id: " + userId)
        );

        user.setUserPwd(updatedPwd);

        User updatedUserObj = userRepository.save(user);

        return UserMapper.mapToUserDto(updatedUserObj);
    }

    @Override
    public UserDto updatePayMode(Long userId, String updatedPayMode) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new ResourceNotFoundException("User does not exist with the given id: " + userId)
        );

        user.setUserPayMode(updatedPayMode);

        User updatedUserObj = userRepository.save(user);

        return UserMapper.mapToUserDto(updatedUserObj);
    }

    @Override
    public void deleteUser(Long userId) {

        User user = userRepository.findById(userId).orElseThrow(
                () -> new ResourceNotFoundException("User does not exist with the given id: " + userId)
        );

        userRepository.deleteById(userId);
    }
}