package com.pontescr.projectbootcamp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
	public Page<ClientDTO> findAllPaged(PageRequest request) {
		Page<Client> list = repository.findAll(request);
		return list.map(x -> new ClientDTO(x));
	}
}
