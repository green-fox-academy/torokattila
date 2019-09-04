package com.rest.demo.controllers;

import com.rest.demo.controllers.repositories.LogRepository;
import com.rest.demo.models.*;
import com.rest.demo.models.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@org.springframework.web.bind.annotation.RestController
public class RestController {

  private LogRepository logRepository;

  @Autowired
  public RestController(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  @GetMapping("/doubling")
  public ResponseEntity doubling(@RequestParam(value = "input", required = false) Integer doublingResult) {
    logRepository.save(new Log("/doubling", "input=" + doublingResult));
    if (doublingResult != null) {
      Doubling doubling = new Doubling(doublingResult);
      return ResponseEntity.status(200).body(doubling);
    } else {
      return ResponseEntity.status(200).body("Please provide an input!");
    }
  }

  @GetMapping("/greeter")
  public ResponseEntity greeter(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    logRepository.save(new Log("/greeter", "name=" + name + "&" + "title=" + title));
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
    logRepository.save(new Log("/appenda/" + appendable));
    if (appendable != null) {
      AppendA appendA = new AppendA(appendable);
      return ResponseEntity.status(200).body(appendA);
    } else {
      return ResponseEntity.status(404).build();
    }
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity doUntil(@PathVariable(name = "action") String action, @RequestBody Until until) {
    logRepository.save(new Log("/dountil/" + action, until.toString()));
    DoUntil doUntil = new DoUntil();
    if (until != null) {
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

  @PostMapping("/arrays")
  public ResponseEntity operationsWithArray(@RequestBody Arrays arrays) {
    Operations operations = new Operations();
    logRepository.save(new Log("/arrays" + arrays));
    if (arrays != null) {
      if (arrays.getWhat().equals("sum")) {
        operations.sum(arrays.getNumbers());
        return ResponseEntity.status(200).body(operations);
      } else if (arrays.getWhat().equals("multiply")) {
        operations.multiply(arrays.getNumbers());
        return ResponseEntity.status(200).body(operations);
      } else if (arrays.getWhat().equals("double")) {
        ArrayResult arrayResult = new ArrayResult();
        arrayResult.doubling(arrays.getNumbers());
        return ResponseEntity.status(200).body(arrayResult);
      }
    }
    Error error = new Error("Please provide what to do with the numbers!");
    return ResponseEntity.status(200).body(error);
  }

  @GetMapping("/log")
  public ResponseEntity log() {
    LogList logList = new LogList(logRepository.findAll());
    return ResponseEntity.status(200).body(logList);
  }
}
