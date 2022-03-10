package com.email.com.email.controllar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailControllar {

    @RequestMapping("/welcome")
    public String welcome(){
        return "Welcome to Email App";
    }
}
