package com.sixth.lecture.raisetech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    String hello() {
        return "Hello World";
    }

    @GetMapping("/china")
        String china() {
        return "China";
    }

    @GetMapping("/korea")
    String korea() {
        return "Korea";
    }

    @GetMapping("/japan")
    String japan() {
        return "日本は今%sです".formatted(LocalDateTime.now());
    }
}
