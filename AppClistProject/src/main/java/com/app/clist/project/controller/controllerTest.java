package com.app.clist.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerTest {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World dude";
    }
}
