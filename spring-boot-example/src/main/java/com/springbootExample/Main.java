package com.springbootExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public GreetResponse greet(){
        return new GreetResponse("Hello", List.of("Java", "C++", "C"), new Person("Fran", 24, 300));
    }

    record Person (String name, int age, double savings){

    }

    record GreetResponse(String greet, List<String> favProgrammingLanguages, Person person){
    }

}
