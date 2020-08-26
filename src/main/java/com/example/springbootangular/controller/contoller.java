package com.example.springbootangular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class contoller {

    @GetMapping("/")
    public String start(){
        return "String";
    }


}
