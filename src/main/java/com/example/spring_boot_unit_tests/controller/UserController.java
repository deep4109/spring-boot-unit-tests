package com.example.spring_boot_unit_tests.controller;

import com.example.spring_boot_unit_tests.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @RequestMapping("user")
    public String getUser(Model model) {
        List<User> lst = new ArrayList<>();
        lst.add(new User(1, "Tom", 32));
        lst.add(new User(2, "Jerry", 29));
        lst.add(new User(3, "Nancy", 27));
        model.addAttribute("list", lst);

        return "demo";

    }
}
