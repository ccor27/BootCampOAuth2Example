package com.example.obspringsecurityoauthgithub.controller;



import org.springframework.web.bind.annotation.GetMapping;


@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String principalPage(){
        return "Principal";
    }

    @GetMapping("/Page1")
    public String page1(){
        return "Page1";
    }

}
