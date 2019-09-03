package com.rest.demo.controllers;

import com.rest.demo.models.AppendA;
import com.rest.demo.models.Doubling;
import com.rest.demo.models.Error;
import com.rest.demo.models.Greeter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

  @GetMapping("/greeter")
  public ResponseEntity greeter(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    if (name != null && title != null) {
      Greeter greeter = new Greeter("Oh, hi there " + name + ", my dear " + title + '!');
      return ResponseEntity.status(200).body(greeter);
    } else if (title != null) {
      Error error = new Error("Please provide a name!");
      return ResponseEntity.status(200).body(error);
    } else if (name != null) {
      Error error = new Error("Please provide a title!");
      return ResponseEntity.status(200).body(error);
    } else {
      Error error = new Error("Please provide a name and a title!");
      return ResponseEntity.status(200).body(error);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity appenda(@PathVariable(name = "appendable") String appendable) {
    if (appendable != null) {
      AppendA appendA = new AppendA(appendable);
      return ResponseEntity.status(200).body(appendA);
    } else {
      return ResponseEntity.status(404).build();
    }
  }

}
