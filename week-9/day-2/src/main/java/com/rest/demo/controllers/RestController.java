package com.rest.demo.controllers;

import com.rest.demo.models.Doubling;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/doubling")
  public ResponseEntity doubling(@RequestParam(value = "input", required = false) Integer doublingResult) {
    if (doublingResult != null) {
      Doubling doubling = new Doubling(doublingResult);
      return ResponseEntity.status(200).body(doubling);
    } else {
      return ResponseEntity.status(200).body("Please provide an input!");
    }
  }
}
