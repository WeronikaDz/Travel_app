package com.travel_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PersonalizeLoginPage {
    @GetMapping("login")
    public String getLogin(){
        return "login";
    }

}
