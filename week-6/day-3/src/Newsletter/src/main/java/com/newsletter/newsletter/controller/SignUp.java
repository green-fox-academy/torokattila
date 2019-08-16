package com.newsletter.newsletter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignUp {

  User user = new User();

  @GetMapping("/web/signUp")
  public String shopPage() {
    return "signupForm";
  }

}
