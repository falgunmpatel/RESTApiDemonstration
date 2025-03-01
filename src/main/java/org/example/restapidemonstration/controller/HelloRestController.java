package org.example.restapidemonstration.controller;

import org.example.restapidemonstration.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {
  @RequestMapping(path = "/hello", method = RequestMethod.GET)
  public String hello() {
    return "Hello, World!";
  }

  @RequestMapping(path = "/hello/query", method = RequestMethod.GET)
  public String helloQuery(@RequestParam(name = "name", defaultValue = "World") String name) {
    return "Hello, " + name + "!";
  }

  @RequestMapping(path = "/hello/path/{name}", method = RequestMethod.GET)
  public String helloPath(@PathVariable String name) {
    return "Hello, " + name + "!";
  }

  @RequestMapping(path = "/hello/post", method = RequestMethod.POST)
  public String helloPost(@RequestBody User user) {
    return "Hello, " + user.getFirstName() + " " + user.getLastName() + "!";
  }

  @RequestMapping(path = "/hello/put/{firstName}", method = RequestMethod.PUT)
  public String helloPut(
      @PathVariable String firstName, @RequestParam(name = "lastName") String lastName) {
    return "Hello, " + firstName + " " + lastName + "!";
  }
}