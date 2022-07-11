package io.github.pedrocaporrino.clientes.model.repository;

import io.github.pedrocaporrino.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
