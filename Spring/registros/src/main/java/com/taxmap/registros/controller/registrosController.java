package com.taxmap.registros.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class registrosController {

    @GetMapping("/hello")
    public String getMethodName() {
        return "Hello";
    }
    
}
