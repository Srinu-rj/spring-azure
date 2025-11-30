package com.azure_pipiline.spring_azure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/html")
public class Webpage {

    @GetMapping("/application")
    public String demo_application(){
        return "home";
    }

}
