package com.rest.demo.controllers.repositories;

import com.rest.demo.models.Log;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LogRepository extends CrudRepository<Log, Integer> {

  List<Log> findAll();
}
