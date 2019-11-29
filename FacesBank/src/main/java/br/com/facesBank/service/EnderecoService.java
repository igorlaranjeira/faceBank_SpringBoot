package br.com.facesBank.service;

import java.util.List;

import br.com.facesBank.domain.EnderecoEntity;

public interface EnderecoService {


	void salvar (EnderecoEntity endereco);
	
	void editar (EnderecoEntity endereco);
	
	void excluir (Long id);
	
	EnderecoEntity buscarId(Long id);
	
	List<EnderecoEntity> buscarTodos();

}
