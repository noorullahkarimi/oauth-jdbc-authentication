package com.example.oauth2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @GetMapping("/login")
    public String login(){
        return "/login.html";
    }
    @GetMapping("/")
    @ResponseBody
    public String index(){
        return "original page";
    }
    @GetMapping("/users")
    @ResponseBody
    public String users(){
        return "users page";
    }
}
