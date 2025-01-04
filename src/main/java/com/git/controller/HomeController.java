package com.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Hii ! Thank you for visit";
    }
    
    @GetMapping("/hello")
    public String hello() {
    	return "Hello";
    }
}
