package br.com.facesBank.service;
import java.util.List;

import br.com.facesBank.domain.ClienteEntity;

public interface ClienteService {

	void salvar (ClienteEntity cliente);
	
	void editar (ClienteEntity cliente);
	
	void excluir (Long id);
	
	ClienteEntity buscarId(Long id);
	
	List<ClienteEntity> buscarTodos();

}
