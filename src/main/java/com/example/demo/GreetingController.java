package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	private static final String hello = "Hello, World!";
    @RequestMapping("/")
    public String greeting() {
        return hello;
    }
}
