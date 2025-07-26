package com.practice.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// RestController -- response type is data
// Controller -- response type is layout. we need to add ResponseBody annotation to API method to return data for this.
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return "Logged in successful";
    }

    @RequestMapping("/logout")
    public String logout(){
        return "Logged out successful";
    }
}
