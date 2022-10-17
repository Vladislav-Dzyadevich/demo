package com.carService.demo.service;

import com.carService.demo.dto.UserDto;
import com.carService.demo.entity.User;

import java.util.List;

public interface UserService {
    void addUser(UserDto userDto);

    List<User> showUsers();
}
