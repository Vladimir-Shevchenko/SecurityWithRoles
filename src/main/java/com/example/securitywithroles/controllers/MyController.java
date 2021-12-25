package com.example.securitywithroles.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hi")
    public  String hi() {
return "<h1>Hi!<h2>";
    }

    @GetMapping("/user")
    public  String user() {
        return "<h1>Hi, User!<h2>";
    }

    @GetMapping("/admin")
    public  String admin() {
        return "<h1>Hi, Admin!<h2>";
    }
}
