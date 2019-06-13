package com.example.demo.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// provides hints for Spring that the class plays a specific role. Our class is a web @Controller so Spring considers it when handling incoming web requests
@RestController

public class MainController {
    //request mapping
    //annotations that provides "routing" info. Tells spring that any http request "/" path should be mapped to the home() method
    @RequestMapping("/")
    //Because of restcontroller annotation spring renders resulting string directly back to the caller. In this case is home method and string is returned
    public String home() {
        return "Hello, World!";
    }

}
