package org.example.restapidemonstration.controller;

import org.example.restapidemonstration.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloRestController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
