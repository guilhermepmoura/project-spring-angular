package com.github.guilhermepmoura.clientes.model.repository;

import com.github.guilhermepmoura.clientes.model.entity.Serviço;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiçoRepository extends JpaRepository<Serviço, Integer> {
}
