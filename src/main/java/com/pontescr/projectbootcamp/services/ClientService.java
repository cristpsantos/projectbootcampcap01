package com.pontescr.projectbootcamp.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pontescr.projectbootcamp.dto.ClientDTO;
import com.pontescr.projectbootcamp.entities.Client;
import com.pontescr.projectbootcamp.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll() {
		List<Client> entity = repository.findAll();
		return entity.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
	}
}
