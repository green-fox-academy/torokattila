package com.sql.connection;

import com.sql.connection.model.Todo;
import com.sql.connection.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionApplication implements CommandLineRunner {

  @Autowired
  TodoRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(ConnectionApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
//    repository.save(new Todo("Buy Milk", true, false));
//    repository.save(new Todo("Go Home", false, true));
//    repository.save(new Todo("Play with cat", false, true));
//    repository.save(new Todo("Drink water", false, true));
  }
}
