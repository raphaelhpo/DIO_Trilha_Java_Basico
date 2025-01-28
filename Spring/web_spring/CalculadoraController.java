package br.com.orati.springapi.web_spring.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Calculadora")
public class CalculadoraController {
    
    //CalculadoraSomar/somar/10/20
    @GetMapping(path = "/somar/{a}/{b}")
    public int somar(@PathVariable int a, @PathVariable int b) {
        return (a + b);
    }

    //Calculadora/subtrair?a=10&b=20
    @GetMapping(path = "/subtrair")
    public int subtrair(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b) {
        return (a - b);
    }
}
