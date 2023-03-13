package com.practice.graalAot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public ResponseEntity<String> getHelloWorld(){
        return  ResponseEntity.status(200).body("Hello World");
    }

}
