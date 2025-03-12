package br.com.projectspend.spend_project.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.projectspend.spend_project.model.gastos.GastosAleatorios;
import br.com.projectspend.spend_project.model.gastos.GastosFixos;
import br.com.projectspend.spend_project.model.gastos.GastosVariaveis;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private String name;
    private BigDecimal renda;
    private LocalDate dataVigente;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
    List<GastosFixos> gastosFixos = new ArrayList<>();
    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
    List<GastosVariaveis> gastosVariaveis = new ArrayList<>();
    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
    List<GastosAleatorios> gastosAleatorios = new ArrayList<>();
}
