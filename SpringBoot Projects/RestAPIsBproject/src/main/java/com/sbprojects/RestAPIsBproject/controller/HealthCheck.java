package com.sbprojects.RestAPIsBproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/health-check")
    public String checkHealth()
    {
        return "Heyy!!!!";
    }
}
