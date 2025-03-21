package br.com.projectspend.spend_project.dto.gastos;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.projectspend.spend_project.model.gastos.enums.StatusGasto;
import br.com.projectspend.spend_project.model.gastos.enums.TipoDeGasto;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class GastosDTO {
    private Long id;
    private TipoDeGasto tipoGasto;
    private String nome;
    private BigDecimal valor;
    private LocalDate data;
    private StatusGasto status = StatusGasto.NAO_PAGO;
}
