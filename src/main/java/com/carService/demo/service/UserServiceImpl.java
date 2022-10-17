package com.carService.demo.service;

import com.carService.demo.dto.UserDto;
import com.carService.demo.entity.User;
import com.carService.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> showUsers() {
        return userRepository.showUsers();
    }

    @Override
    public void addUser(UserDto userDto) {
        User user = new User();
        user.setAge(userDto.getAge());
        user.setName(userDto.getName());
        user.setSurName(userDto.getSurName());
        user.setCars(userDto.getCars());
        userRepository.saveUsers(user);
    }
}
