package com.bank.FacesBank.service;

import java.util.List;

import com.bank.FacesBank.domain.UsuarioEntity;

public interface UsuarioService {

	void salvar (UsuarioEntity usuario);
	
	void editar (UsuarioEntity usuario);
	
	void excluir (Long id);
	
	UsuarioEntity buscarId(Long id);
	
	List<UsuarioEntity> buscarTodos();

}
