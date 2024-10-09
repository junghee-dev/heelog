package com.example.heelog.controller;

import com.example.heelog.service.HeelogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HeelogController {

    @Autowired
    HeelogService heelogService;

    @GetMapping("/heelog")
    public void test() {
        System.out.println("test");
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }


    @GetMapping("/getMainProfile")
    public String getMainProfile(@RequestParam String userId, Model model) {
        heelogService.getMainProfile(userId);
        return "index";
    }



}
