package com.example.springcodeql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @QueryMapping
    public List<Person> findUsers(@Argument String name) {
        System.out.println("Finding for user: " + name);
        return personRepository.findAll();
    }
}