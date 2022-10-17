package com.carService.demo.controller;

import com.carService.demo.dto.UserDto;
import com.carService.demo.entity.User;
import com.carService.demo.enums.Car;
import com.carService.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<String> addUser(@RequestParam("name") String name,
                                          @RequestParam("surName") String surName,
                                          @RequestParam("age") Integer age,
                                          @RequestParam("car") List<Car> cars) {
        UserDto userDto = new UserDto(name, surName, age, cars);
        userService.addUser(userDto);

        return ResponseEntity.ok("Ok");
    }

    @PostMapping("/showUsers")
    public List<User> showUsers() {
        return userService.showUsers();
    }

}
