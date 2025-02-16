package br.com.fastcommerce.fastcommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fastcommerce.fastcommerce.model.pedidoEntity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    
}
