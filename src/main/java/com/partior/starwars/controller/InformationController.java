package com.partior.starwars.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InformationController {


    @GetMapping("/home")
    public String home() {
        return "Testing configuration.";
    }

    @GetMapping("/information")
    public String information() {
        return "Testing API configurations.";
    }
}
