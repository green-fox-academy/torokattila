package com.sql.connection.controller;

import com.sql.connection.model.Todo;
import com.sql.connection.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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

  @GetMapping("/add")
  public String renderAddTodo(Model model) {
    model.addAttribute("todo", new Todo());
    return "addNewTodo";
  }

  @PostMapping("/add")
  public String addTodo(@ModelAttribute Todo newTodo) {
    todoRepository.save(newTodo);
    return "redirect:/todo/list";
  }

  @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public String delete(@PathVariable("id") long id) {
    todoRepository.deleteById(id);
    return "redirect:/todo/list";
  }
}