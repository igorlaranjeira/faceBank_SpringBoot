package com.bank.FacesBank.service;

import java.util.List;

import com.bank.FacesBank.domain.FuncionarioEntity;

public interface FuncionarioService {

void salvar (FuncionarioEntity funcionario);
	
	void editar (FuncionarioEntity funcionario);
	
	void excluir (Long id);
	
	FuncionarioEntity buscarId(Long id);
	
	List<FuncionarioEntity> buscarTodos();
}
