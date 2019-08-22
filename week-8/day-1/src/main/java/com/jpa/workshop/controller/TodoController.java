package com.jpa.workshop.controller;

import com.jpa.workshop.model.Todo;
import com.jpa.workshop.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @RequestMapping(value={"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todoList", todoRepository.findAll());
    return "todolist";
  }
}
