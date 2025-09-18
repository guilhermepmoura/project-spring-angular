package com.github.guilhermepmoura.clientes;

import com.github.guilhermepmoura.clientes.model.entity.Cliente;
import com.github.guilhermepmoura.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class ClientesApplication {

    @Bean
    public CommandLineRunner run(@Autowired ClienteRepository repository){
        return args -> {
            Cliente cliente = Cliente.builder().cpf("00000000000").nome("Fulano").dataCadastro(LocalDate.now()).build();
            repository.save(cliente);

        };
    }

	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
	}

}
