package com.email.com.email.controllar;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailControllar {

    public String welcom(){
        return "Welcome to Email App";
    }
}
