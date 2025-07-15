package com.example.springsecsection1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
public static final double piValue =3.14;
    @GetMapping("/myAccount")
    public String getAccountDetails(){
        System.out.println("Entered for checking merge");
        return "Account Details";
    }
}
