package com.github.guilhermepmoura.clientes.model.repository;

import com.github.guilhermepmoura.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
