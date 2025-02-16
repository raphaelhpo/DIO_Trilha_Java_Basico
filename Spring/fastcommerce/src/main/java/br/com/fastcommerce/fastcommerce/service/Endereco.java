package br.com.fastcommerce.fastcommerce.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface Endereco {
    @GetMapping("/{cep}/json/")
    public String getEndereco(@PathVariable String cep);
}

