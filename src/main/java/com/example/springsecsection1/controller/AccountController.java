package com.example.springsecsection1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/myAccount")
    public String getAccountDetails(){
        System.out.println("Entered in Account details Controller abcd");
        return "Account Details";
    }
}
