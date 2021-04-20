package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class Controller {
    private String status = null;
    @PostMapping
    public void postStatus() {
        this.status = "posted";
    }
    @GetMapping
    public String getStatus() {
        return this.status;
    }
}
