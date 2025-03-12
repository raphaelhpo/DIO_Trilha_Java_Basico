package br.com.projectspend.spend_project.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.projectspend.spend_project.dto.gastos.GastosFixosDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    private Long id;
    private String name;
    private BigDecimal renda;
    private LocalDate dataVigente;
    private List<GastosFixosDTO> gastosFixos;
}
