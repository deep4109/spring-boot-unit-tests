package com.example.spring_boot_unit_tests;

import com.example.spring_boot_unit_tests.service.UserService;
import jakarta.annotation.Resource;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class) // @RunWith: integrate spring with junit
@SpringBootTest(classes = {SpringBootUnitTestsApplication.class}) // @SpringBootTest: this class is spring boot test.
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testGetUser() {
        Assertions.assertEquals(userService.getUser(), "Tom");
    }
}
