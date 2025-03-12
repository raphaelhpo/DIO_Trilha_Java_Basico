package br.com.projectspend.spend_project.model.gastos;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class GastosVariaveis extends Gastos{
    private int parcela;
    private LocalDate dataParcela;
    private int qtdParcelas;
}
