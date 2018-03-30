package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//make this java class a spring mvc controller using restController
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Das Boot, Reporting for Duty";
    }
}
