package com.example.minhaapi.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Olá, mundo!";
    }
}