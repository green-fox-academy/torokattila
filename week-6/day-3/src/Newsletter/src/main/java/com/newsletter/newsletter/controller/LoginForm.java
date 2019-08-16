package com.newsletter.newsletter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginForm {
  User user = new User();

  @GetMapping("/web/login")
  public String showPage() {
    return "loginPage";
  }

}
