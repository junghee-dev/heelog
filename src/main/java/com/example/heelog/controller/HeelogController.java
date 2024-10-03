package com.example.heelog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeelogController {

    @GetMapping("/heelog")
    public void test() {
        System.out.println("test");
    }
}
