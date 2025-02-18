package br.com.fastcommerce.fastcommerce.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.fastcommerce.fastcommerce.model.Endereco;
@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface ViaCepClient {
    @GetMapping("/{cep}/json/")
    public Endereco getEndereco(@PathVariable("cep") String cep);
}
