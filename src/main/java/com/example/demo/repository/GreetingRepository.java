package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Greeting;

public interface GreetingRepository extends CrudRepository<Greeting, String>{

}
