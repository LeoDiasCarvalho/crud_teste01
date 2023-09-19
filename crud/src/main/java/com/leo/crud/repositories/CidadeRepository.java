package com.leo.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leo.crud.entities.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{

}
