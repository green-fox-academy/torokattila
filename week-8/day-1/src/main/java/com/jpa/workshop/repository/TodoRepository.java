package com.jpa.workshop.repository;

import com.jpa.workshop.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
