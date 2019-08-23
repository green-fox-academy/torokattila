package com.sql.connection.controller;

import com.sql.connection.model.Todo;
import com.sql.connection.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @RequestMapping(value={"/list"})
  public String list(Model model) {
    model.addAttribute("todoList", todoRepository.findAll());
    return "todolist";
  }

  @GetMapping("/")
  public String listFalseDone(Model model, @RequestParam(value="isActive", required = false) boolean status) {
    List<Todo> filteredList = todoRepository.findAll();
    if (status) {
      filteredList = todoRepository.findAll().stream()
              .filter(x -> !x.isDone())
              .collect(Collectors.toList());
      model.addAttribute("todoList", filteredList);
    }
    return "todolist";
  }
}