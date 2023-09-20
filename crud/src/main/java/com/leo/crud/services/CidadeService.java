package com.leo.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.crud.entities.Cidade;
import com.leo.crud.excepions.CidadeNotFoundException;
import com.leo.crud.repositories.CidadeRepository;



@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository cidadeRepo;
	
	public Cidade salvarCidade(Cidade cidade) {
		return cidadeRepo.save(cidade);
	}
	
	public Cidade buscarCidadePorId(Long id) throws CidadeNotFoundException {
		Optional<Cidade> cidade = cidadeRepo.findById(id);
		if(cidade.isPresent()) {
			return cidade.get();
		}else {
			throw new CidadeNotFoundException("Cidade com id: " + id + " não existe!");
		}
		
	}
	
	public List<Cidade> buscarTodosCidades(){
		return cidadeRepo.findAll();
	}
	
	public Cidade atualizarCidade(Cidade cidade) {
		return cidadeRepo.save(cidade);
	}
	
	public void excluirCidade(long id) throws CidadeNotFoundException {
		Cidade cidade = buscarCidadePorId(id);
		cidadeRepo.delete(cidade);
	}

}
