package com.leo.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.crud.entities.Veiculo;
import com.leo.crud.excepions.VeiculoNotFoundException;
import com.leo.crud.repositories.VeiculoRepository;



@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository veiculoRepo;
	
	public Veiculo salvarVeiculo(Veiculo veiculo) {
		return veiculoRepo.save(veiculo);
	}
	
	public Veiculo buscarVeiculoPorId(Long id) throws VeiculoNotFoundException {
		Optional<Veiculo> veiculo = veiculoRepo.findById(id);
		if(veiculo.isPresent()) {
			return veiculo.get();
		}else {
			throw new VeiculoNotFoundException("Veiculo com id: " + id + " não existe!");
		}
		
	}
	
	public List<Veiculo> buscarTodosVeiculos(){
		return veiculoRepo.findAll();
	}
	
	public Veiculo atualizarVeiculo(Veiculo veiculo) {
		return veiculoRepo.save(veiculo);
	}
	
	public void excluirVeiculo(long id) throws VeiculoNotFoundException {
		Veiculo veiculo = buscarVeiculoPorId(id);
		veiculoRepo.delete(veiculo);
	}

}
