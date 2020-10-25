package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Endpoint {

    @GetMapping("/names")
    public List<String> getNames() {
        return Arrays.asList("hello", "world", "from", "france");
    }
}
