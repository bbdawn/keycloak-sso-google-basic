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

    @RequestMapping("/permit-all")
    public String roleTest1() {
        //http://localhost:3001/permit-all
        return "This is permitAll! 누구든지 접근 가능합니다";
    }

    @RequestMapping("/authenticate")
    public String roleTest2() {
        //http://localhost:3001/only-login-user
        return "인증한(로그인한) 사용자만 접근 가능합니다";
    }

    @RequestMapping("/authenticate/role/admin")
    public String roleTest3() {
        //http://localhost:3001/only-role-admin
        return "Admin Role을 가지고 있는 사용자만 접근 가능합니다";
    }

    @RequestMapping("/authenticate/role/user")
    public String roleTest4() {
        //http://localhost:3001/only-role-user
        return "User Role을 가지고 있는 사용자만 접근 가능합니다";
    }


}
