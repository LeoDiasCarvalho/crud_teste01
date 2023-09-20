package com.leo.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.crud.entities.Cliente;
import com.leo.crud.excepions.ClienteNotFoundException;
import com.leo.crud.repositories.ClienteRepository;



@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepo;
	
	public Cliente salvarCliente(Cliente cliente) {
		return clienteRepo.save(cliente);
	}
	
	public Cliente buscarClientePorId(Long id) throws ClienteNotFoundException {
		Optional<Cliente> cliente = clienteRepo.findById(id);
		if(cliente.isPresent()) {
			return cliente.get();
		}else {
			throw new ClienteNotFoundException("Cliente com id: " + id + " não existe!");
		}
		
	}
	
	public List<Cliente> buscarClientesPorNome(String nome){
		return clienteRepo.findByNomeContainingIgnoreCase(nome);
	}
	
	public List<Cliente> buscarTodosClientes(){
		return clienteRepo.findAll();
	}
	
	public Cliente atualizarCliente(Cliente cliente) {
		return clienteRepo.save(cliente);
	}
	
	public void excluirCliente(long id) throws ClienteNotFoundException {
		Cliente cliente = buscarClientePorId(id);
		clienteRepo.delete(cliente);
	}

}
