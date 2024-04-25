package com.github.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        return "home.html";
    }

    @RequestMapping //so localhost:8080 is home.html (without mention /hi or /home etc.)
    public String home1(){
        return "customer.html";
    }

    @RequestMapping( {"/hi", "no","yea"}) //we can add more than 1 navigator
    public String home2(){
        return "home.html";
    }
    @RequestMapping("/tarik") //from another navigator to same page
    public String getHomePage(){
        return "home.html";
    }

    @RequestMapping("/customer")
    public String customer(){
        return "customer.html";
    }
}
