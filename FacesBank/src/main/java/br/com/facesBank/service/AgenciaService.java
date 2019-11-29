package br.com.facesBank.service;

import java.util.List;

import br.com.facesBank.domain.AgenciaEntity;

public interface AgenciaService {

	void salvar (AgenciaEntity agencia);
	
	void editar (AgenciaEntity agencia);
	
	void excluir (Long id);
	
	AgenciaEntity buscarId(Long id);
	
	List<AgenciaEntity> buscarTodos();

}
