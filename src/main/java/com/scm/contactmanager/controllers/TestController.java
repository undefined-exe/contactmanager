package com.scm.contactmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {

    @GetMapping("/")
    public String home() {
        return "pages/home";
    }
    
    @GetMapping("/about")
    public String about() {
        return "pages/about";
    }

    @ResponseBody
    @GetMapping("/services")
    public String services() {
        return "Services Page";
    }

    @ResponseBody
    @GetMapping("/contact")
    public String contact() {
        return "Contact Page";
    }
}
