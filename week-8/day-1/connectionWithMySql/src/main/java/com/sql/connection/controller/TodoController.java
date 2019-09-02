package com.sql.connection.controller;

import com.sql.connection.model.Assignee;
import com.sql.connection.model.Todo;
import com.sql.connection.repository.AssigneeRepository;
import com.sql.connection.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoRepository todoRepository;
  private AssigneeRepository assigneeRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
    this.todoRepository = todoRepository;
    this.assigneeRepository = assigneeRepository;
  }

  @RequestMapping(value={"/list"})
  public String list(Model model) {
    model.addAttribute("todoList", todoRepository.findAll());
    return "todolist";
  }

  @GetMapping("/")
  public String listFalseDone(Model model, @RequestParam(value="isActive", required = false) boolean status) {
    if (status) {
      model.addAttribute("todolist", todoRepository.findAllByDone(!status));
    } else {
      model.addAttribute("todolist", todoRepository.findAll());
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

  @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
  public String editTodoPage(@PathVariable("id") long id, Model model) {
    model.addAttribute("todo", todoRepository.findById(id));
    model.addAttribute("id", id);
    return "editTodo";
  }

  @PostMapping(value = "/{id}/edit")
  public String updateTodo(@ModelAttribute Todo editedTodo, @PathVariable(name = "id") long id) {
    todoRepository.save(editedTodo);
    return "redirect:/todo/list";
  }

  @PostMapping("/list")
  public String searchTodo(Model model, @RequestParam(name = "searchText", required = false) String searchText) {
    model.addAttribute("todoList", todoRepository.findAllByTitle(searchText));
    return "todolist";
  }

  @GetMapping("/assignee")
  public String listAssignee(Model model) {
    model.addAttribute("assigneeList", assigneeRepository.findAll());
    return "assigneeList";
  }

  @GetMapping("/assignee")
  public String addAssigneePage(@ModelAttribute Assignee newAssignee) {
    assigneeRepository.save(newAssignee);
    return "redirect:/todo/assigneeList";
  }
}