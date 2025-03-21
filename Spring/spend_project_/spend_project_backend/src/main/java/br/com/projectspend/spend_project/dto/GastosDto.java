package br.com.projectspend.spend_project.dto;

import java.math.BigDecimal;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class GastosDto {

    private String nome;
    private BigDecimal valor;
    private Long usuarioId;
}
