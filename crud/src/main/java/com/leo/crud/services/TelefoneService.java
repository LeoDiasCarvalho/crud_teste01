package com.leo.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.crud.entities.Telefone;
import com.leo.crud.excepions.TelefoneNotFoundException;
import com.leo.crud.repositories.TelefoneRepository;



@Service
public class TelefoneService {
	
	@Autowired
	private TelefoneRepository telefoneRepo;
	
	public Telefone salvarTelefone(Telefone telefone) {
		return telefoneRepo.save(telefone);
	}
	
	public Telefone buscarTelefonePorId(Long id) throws TelefoneNotFoundException {
		Optional<Telefone> telefone = telefoneRepo.findById(id);
		if(telefone.isPresent()) {
			return telefone.get();
		}else {
			throw new TelefoneNotFoundException("Telefone com id: " + id + " não existe!");
		}
		
	}
	
	public List<Telefone> buscarTodosTelefones(){
		return telefoneRepo.findAll();
	}
	
	public Telefone atualizarTelefone(Telefone telefone) {
		return telefoneRepo.save(telefone);
	}
	
	public void excluirTelefone(long id) throws TelefoneNotFoundException {
		Telefone telefone = buscarTelefonePorId(id);
		telefoneRepo.delete(telefone);
	}

}
