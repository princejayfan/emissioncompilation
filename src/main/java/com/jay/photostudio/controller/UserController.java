package com.jay.photostudio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("user")
public class UserController {

    @GetMapping("index")
    public String index(){
        return "Hello Word";
    }
}
