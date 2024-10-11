package com.example.heelog.controller;

import com.example.heelog.entity.User;
import com.example.heelog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
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
    public String getUserInfo(@RequestParam(defaultValue = "junghee.yu") String userId, Model model) {
        User user = userService.getUserInfo(userId);
        model.addAttribute("user", user);
        return "main";
    }



}
