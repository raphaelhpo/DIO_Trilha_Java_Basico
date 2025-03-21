package br.com.projectspend.spend_project.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UsuarioDto {
    private String nome;
    private BigDecimal renda;
    private LocalDate dataVigente;
}
