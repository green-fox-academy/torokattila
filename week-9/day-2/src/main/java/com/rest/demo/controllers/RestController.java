package com.rest.demo.controllers;

import com.rest.demo.models.*;
import com.rest.demo.models.Error;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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

  @PostMapping("/dountil/{action}")
  public ResponseEntity doUntil(@PathVariable(name = "action") String action, @RequestBody Until until) {
    if (until != null) {
      DoUntil doUntil = new DoUntil();
      if (action.equals("sum")) {
        doUntil.sum(until.getUntil());
        return ResponseEntity.status(200).body(doUntil);
      } else if (action.equals("factor")) {
        doUntil.factor(until.getUntil());
        return ResponseEntity.status(200).body(doUntil);
      }
      return ResponseEntity.status(404).build();
    } else {
      Error error = new Error("Please provide a number!");
      return ResponseEntity.status(200).body(error);
    }

  }

}
