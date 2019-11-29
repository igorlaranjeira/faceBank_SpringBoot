package br.com.facesBank.service;

import java.util.List;

import br.com.facesBank.domain.UsuarioEntity;

public interface UsuarioService {

	void salvar (UsuarioEntity usuario);
	
	void editar (UsuarioEntity usuario);
	
	void excluir (Long id);
	
	UsuarioEntity buscarId(Long id);
	
	List<UsuarioEntity> buscarTodos();

}
