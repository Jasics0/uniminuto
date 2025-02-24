package com.nobugs.taller2uniminuto.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/hello")
public class HelloWorldController {


    @GetMapping("/world")
    public String helloWorld() {
        return "Hello Uniminuto!";
    }

    @GetMapping("")
    public String hello() {
        return "Hello!";
    }

}
