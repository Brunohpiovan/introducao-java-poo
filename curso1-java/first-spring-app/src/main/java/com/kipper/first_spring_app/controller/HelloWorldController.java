package com.kipper.first_spring_app.controller;

import com.kipper.first_spring_app.domain.User;
import com.kipper.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String HelloWorld(){
        return helloWorldService.helloWorld("Bruno");
    }

    @PostMapping("/{id}")
    public String helloWorPost(@PathVariable String id, @RequestBody User body){
        return "Hello World " + body.getName();
    }

}
