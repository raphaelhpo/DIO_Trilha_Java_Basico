package br.com.fastcommerce.fastcommerce.model.pedidoEntity;

import java.math.BigDecimal;
import java.util.ArrayList;
import br.com.fastcommerce.fastcommerce.model.Cliente;
import br.com.fastcommerce.fastcommerce.model.Produto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Cliente cliente;
    private ArrayList<Produto> produtos = new ArrayList<>();
    private String cidade;
    private String estado;
    private BigDecimal valorTotal;
    private Status status = Status.PENDENTE;
}
