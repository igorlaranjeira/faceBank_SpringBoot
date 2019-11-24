package com.bank.FacesBank.service;

import java.util.List;

import com.bank.FacesBank.domain.ContaEntity;

public interface ContaService {

	void salvar (ContaEntity conta);
	
	void editar (ContaEntity conta);
	
	void excluir (Long id);
	
	ContaEntity buscarId(Long id);
	
	List<ContaEntity> buscarTodos();

}
