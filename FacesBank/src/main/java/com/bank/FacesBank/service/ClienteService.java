package com.bank.FacesBank.service;

import java.util.List;

import com.bank.FacesBank.domain.ClienteEntity;

public interface ClienteService {

	void salvar (ClienteEntity cliente);
	
	void editar (ClienteEntity cliente);
	
	void excluir (Long id);
	
	ClienteEntity buscarId(Long id);
	
	List<ClienteEntity> buscarTodos();

}
