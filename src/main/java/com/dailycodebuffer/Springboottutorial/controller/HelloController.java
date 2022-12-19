package com.dailycodebuffer.Springboottutorial.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @Controller
// @Component
public class HelloController {

  // @RequestMapping(value="/", method=RequestMethod.GET)
  @GetMapping("/")
  public String helloWorld(){
    return "Welcome to DAILYCODEBUFFER!!";
  }
  @GetMapping("/team")
  public String Springboot(){
    return "Welcome to DAILYCODEBUFFER Springboot!!";
  }
}
