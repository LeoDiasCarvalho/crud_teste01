package com.leo.crud.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leo.crud.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	List<Cliente> findByNomeContainingIgnoreCase(String nome);

}
