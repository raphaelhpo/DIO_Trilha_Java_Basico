package br.com.projectspend.spend_project.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD:Spring/spend_project_/spend_project_backend/src/main/java/br/com/projectspend/spend_project/model/Usuario.java
import com.fasterxml.jackson.annotation.JsonManagedReference;

import br.com.projectspend.spend_project.model.gastos.GastosFixos;
import jakarta.persistence.CascadeType;
=======
import br.com.projectspend.spend_project.model.gastos.GastosAleatorios;
import br.com.projectspend.spend_project.model.gastos.GastosFixos;
import br.com.projectspend.spend_project.model.gastos.GastosVariaveis;
>>>>>>> ccbb4a492d0de6044889a02638d2d8e2b450e469:Spring/spend_project/src/main/java/br/com/projectspend/spend_project/model/Usuario.java
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
    
    private String nome;
    private BigDecimal renda;
    private LocalDate dataVigente;

<<<<<<< HEAD:Spring/spend_project_/spend_project_backend/src/main/java/br/com/projectspend/spend_project/model/Usuario.java
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<GastosFixos> gastosFixos = new ArrayList<>();
=======
    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
    List<GastosFixos> gastosFixos = new ArrayList<>();
    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
    List<GastosVariaveis> gastosVariaveis = new ArrayList<>();
    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
    List<GastosAleatorios> gastosAleatorios = new ArrayList<>();
>>>>>>> ccbb4a492d0de6044889a02638d2d8e2b450e469:Spring/spend_project/src/main/java/br/com/projectspend/spend_project/model/Usuario.java
}
