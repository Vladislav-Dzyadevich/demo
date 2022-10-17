package com.carService.demo.repository;

import com.carService.demo.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void saveUsers(User user) {
            users.add(user);
    }

    public List<User> showUsers() {
        return users;
    }
}
