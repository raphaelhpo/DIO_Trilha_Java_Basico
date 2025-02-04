package com.dio.project.project_web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnderecoController {
    @GetMapping
    public String getEndereco() {
        return "Endereco";
    }
}
