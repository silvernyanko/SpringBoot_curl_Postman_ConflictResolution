package com.example.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GreetController {
    @GetMapping("/greet")
    public String greet() {
        return "Hello, World!";
    }
}

// まずはmainにmerge。そして"Hello, World!"に変化を加える。