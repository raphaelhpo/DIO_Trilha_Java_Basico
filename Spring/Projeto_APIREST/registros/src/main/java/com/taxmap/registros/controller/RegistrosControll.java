package com.taxmap.registros.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/registros")
public class RegistrosControll {

    @GetMapping
    public String getMethodName() {
        return new String("oi");
    }
}
