package com.example.spring_boot_unit_tests.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public String getUser() {
        return "Tom";
    }
}
