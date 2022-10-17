package com.carService.demo.IntegrationTest;

import com.carService.demo.controller.CarController;
import com.carService.demo.dto.UserDto;
import com.carService.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Collections;

import static com.carService.demo.enums.Car.VOLVO;
import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CarControllerTest {

    @InjectMocks
    CarController carController;

    @Mock
    private UserService userService;


    @Test
    public void testAddUser() {
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        UserDto userDto = new UserDto("Vova", "Lokesh", 1, Collections.singletonList(VOLVO));


        ResponseEntity<String> responseEntity = carController.addUser(userDto.getName(), userDto.getSurName(), userDto.getAge(), userDto.getCars());

        assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);

    }

    @Test
    public void testShowUser() {
        assertThat(carController.showUsers()).isNotNull();
    }
}
