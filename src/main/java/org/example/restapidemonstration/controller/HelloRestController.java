package org.example.restapidemonstration.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
  @RequestMapping("/hello")
  public String hello() {
    return "Hello, World!";
  }

  @RequestMapping("/hello/query")
  public String helloQuery(@RequestParam(name = "name", defaultValue = "World") String name) {
    return "Hello, " + name + "!";
  }
}