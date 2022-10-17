package com.carService.demo.serviceTest;

import com.carService.demo.dto.UserDto;
import com.carService.demo.repository.UserRepository;
import com.carService.demo.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;

import static com.carService.demo.enums.Car.BMW;
import static com.carService.demo.enums.Car.VOLVO;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @Test
    public void addUserTest() {
        UserDto userVova = new UserDto("Vova", "Lokesh", 25, Collections.singletonList(VOLVO));
        UserDto userIvan = new UserDto("Ivan", "Golovin", 29, Collections.singletonList(BMW));


        userService.addUser(userVova);
        userService.addUser(userIvan);

        Assert.assertEquals(2, userService.showUsers().size());
    }

}
