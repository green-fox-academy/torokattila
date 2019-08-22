package com.jpa.workshop;

import com.jpa.workshop.model.Todo;
import com.jpa.workshop.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

  @Autowired
  TodoRepository todoRepository;

  public static void main(String[] args) {
    SpringApplication.run(TodoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Start the day"));
    todoRepository.save(new Todo("Finish H2 workshop"));
    todoRepository.save(new Todo("Finish JPA workshop2"));
    todoRepository.save(new Todo("Create CRUD project"));
  }
}
