package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ardi.Patengko
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
}
