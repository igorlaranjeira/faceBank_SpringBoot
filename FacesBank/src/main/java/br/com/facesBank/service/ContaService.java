package br.com.facesBank.service;

import java.util.List;

import br.com.facesBank.domain.ContaEntity;

public interface ContaService {

	void salvar (ContaEntity conta);
	
	void editar (ContaEntity conta);
	
	void excluir (Long id);
	
	ContaEntity buscarId(Long id);
	
	List<ContaEntity> buscarTodos();

}
