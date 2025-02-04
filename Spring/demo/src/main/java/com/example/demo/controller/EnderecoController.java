package com.example.demo.controller;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableFeignClients
@RestController
public class EnderecoController {
    @GetMapping
    public String getEndereco() {
        return "Endereco";
    }
}
