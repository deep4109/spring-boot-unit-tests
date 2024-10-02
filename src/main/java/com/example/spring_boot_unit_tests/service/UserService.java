package com.example.spring_boot_unit_tests.service;

import com.example.spring_boot_unit_tests.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public String getUser() {
        return userDao.getUser();
    }
}
