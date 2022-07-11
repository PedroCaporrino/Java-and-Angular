package io.github.pedrocaporrino.clientes.model.repository;

import io.github.pedrocaporrino.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
