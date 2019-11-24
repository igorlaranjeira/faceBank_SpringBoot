package com.bank.FacesBank.service;

import java.util.List;

import com.bank.FacesBank.domain.AgenciaEntity;

public interface AgenciaService {

	void salvar (AgenciaEntity agencia);
	
	void editar (AgenciaEntity agencia);
	
	void excluir (Long id);
	
	AgenciaEntity buscarId(Long id);
	
	List<AgenciaEntity> buscarTodos();

}
