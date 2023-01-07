package com.sixth.lecture.raisetech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class RestDevelop {

    @RequestMapping(value = "/now")
    String now() {
        return """
                今は
                %s
                です。""".formatted(LocalDateTime.now());
    }

    @RequestMapping(value = "/yesterday")
    String yesterday() {
        return "昨日:%s".formatted(LocalDateTime.now().minusDays(1));
    }

    @GetMapping("/profile")
    public Map<String, String> profile() {
        return Map.of("name", "yoshiki", "age", "24", "sex", "male");
    }

    @GetMapping("/bear")
    String pooh() {
        return """
                pooh
                paddington
                """;
    }
}