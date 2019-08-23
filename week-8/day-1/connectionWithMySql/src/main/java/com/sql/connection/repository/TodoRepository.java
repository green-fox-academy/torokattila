package com.sql.connection.repository;

import com.sql.connection.model.Todo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAll();
}
