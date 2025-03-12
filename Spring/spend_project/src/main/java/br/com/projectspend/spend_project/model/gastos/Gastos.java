package br.com.projectspend.spend_project.model.gastos;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.projectspend.spend_project.model.Usuario;
import br.com.projectspend.spend_project.model.gastos.enums.StatusGasto;
import br.com.projectspend.spend_project.model.gastos.enums.TipoDeGasto;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class Gastos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TipoDeGasto tipoGasto;
    
    private String nome;
    private BigDecimal valor;
    private LocalDate data;
    private StatusGasto status = StatusGasto.NAO_PAGO;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    Usuario usuario;
}
