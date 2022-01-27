package com.example.springbootdemo.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class First {
    @GetMapping("/hello")
    public String hello() {
        return "helo this is hello method";
    }
    @PostMapping("/add/{a}/{b}")
    public int addit(@PathVariable int a, @PathVariable int b) {
        return (a + b);
    }
    @PostMapping("/add")
    public int add(@RequestBody AddModel model) {
        return (model.getA() + model.getB());
    }

    @GetMapping("/home")
    public String home() {
        return "Welcome to Home";
    }
}
