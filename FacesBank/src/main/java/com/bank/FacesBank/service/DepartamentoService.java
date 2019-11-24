package com.bank.FacesBank.service;

import java.util.List;

import com.bank.FacesBank.domain.DepartamentoEntity;

public interface DepartamentoService {

void salvar (DepartamentoEntity departamento);
	
	void editar (DepartamentoEntity departamento);
	
	void excluir (Long id);
	
	DepartamentoEntity buscarId(Long id);
	
	List<DepartamentoEntity> buscarTodos();
}
