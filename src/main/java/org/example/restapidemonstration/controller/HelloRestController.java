package org.example.restapidemonstration.controller;

import org.example.restapidemonstration.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

  @GetMapping
  public String hello() {
    return "Hello, World!";
  }

  @GetMapping("/query")
  public String helloQuery(@RequestParam(name = "name", defaultValue = "World") String name) {
    return "Hello, " + name + "!";
  }

  @GetMapping("/path/{name}")
  public String helloPath(@PathVariable String name) {
    return "Hello, " + name + "!";
  }

  @PostMapping("/post")
  public String helloPost(@RequestBody User user) {
    String firstName = (user.getFirstName() != null) ? user.getFirstName() : "Unknown";
    String lastName = (user.getLastName() != null) ? user.getLastName() : "User";
    return "Hello, " + firstName + " " + lastName + "!";
  }

  @PutMapping("/put/{firstName}")
  public String helloPut(
      @PathVariable String firstName, @RequestParam(name = "lastName") String lastName) {
    return "Hello, " + firstName + " " + lastName + "!";
  }
}