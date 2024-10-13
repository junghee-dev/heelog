package com.example.heelog.controller;

import com.example.heelog.entity.User;
import com.example.heelog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // CORS 설정
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/heelog")
    public void test() {
        System.out.println("test");
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }


    @GetMapping("/main")
    public String getMainInfo(@RequestParam(defaultValue = "junghee.yu") String userId, Model model) {
//        User user = userService.getUserInfo(userId);
//        model.addAttribute("user", user);
        return "main";
    }


    @GetMapping("/user")
    public User getUserInfo(@RequestParam(defaultValue = "junghee.yu") String userId) {
        User user = userService.getUserInfo(userId);


        return user;
    }

}
