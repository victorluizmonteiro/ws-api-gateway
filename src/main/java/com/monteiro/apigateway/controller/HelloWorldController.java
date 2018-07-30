package com.monteiro.apigateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway")
public class HelloWorldController {

    @GetMapping("/helloworld")
    @ResponseStatus(HttpStatus.OK)
    public String hello(){

        return "Hello World API GATETAY !";
    }
}
