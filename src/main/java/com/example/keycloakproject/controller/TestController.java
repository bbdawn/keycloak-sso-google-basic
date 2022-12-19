package com.example.keycloakproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("")
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        //http://localhost:3001/hello
        return "Hello KeyCloak!";
    }

    @RequestMapping("/app1")
    public String tracingTest() {
        //http://localhost:3001/app1
        return "This is permitAll!";
    }


}
