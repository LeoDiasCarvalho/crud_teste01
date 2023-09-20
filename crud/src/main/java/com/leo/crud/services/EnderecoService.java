package com.leo.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.crud.entities.Endereco;
import com.leo.crud.excepions.EnderecoNotFoundException;
import com.leo.crud.repositories.EnderecoRepository;



@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepo;
	
	public Endereco salvarEndereco(Endereco endereco) {
		return enderecoRepo.save(endereco);
	}
	
	public Endereco buscarEnderecoPorId(Long id) throws EnderecoNotFoundException {
		Optional<Endereco> endereco = enderecoRepo.findById(id);
		if(endereco.isPresent()) {
			return endereco.get();
		}else {
			throw new EnderecoNotFoundException("Endereco com id: " + id + " não existe!");
		}
		
	}

	public List<Endereco> buscarTodosEnderecos(){
		return enderecoRepo.findAll();
	}
	
	public Endereco atualizarEndereco(Endereco endereco) {
		return enderecoRepo.save(endereco);
	}
	
	public void excluirEndereco(long id) throws EnderecoNotFoundException {
		Endereco endereco = buscarEnderecoPorId(id);
		enderecoRepo.delete(endereco);
	}

}
