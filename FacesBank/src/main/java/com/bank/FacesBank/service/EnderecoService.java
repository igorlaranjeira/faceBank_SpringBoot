package com.bank.FacesBank.service;

import java.util.List;

import com.bank.FacesBank.domain.EnderecoEntity;

public interface EnderecoService {


	void salvar (EnderecoEntity endereco);
	
	void editar (EnderecoEntity endereco);
	
	void excluir (Long id);
	
	EnderecoEntity buscarId(Long id);
	
	List<EnderecoEntity> buscarTodos();

}
