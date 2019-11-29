package br.com.facesBank.service;

import java.util.List;

import br.com.facesBank.domain.MovimentacaoEntity;

public interface MovimentacaoService {

	void salvar (MovimentacaoEntity movimentacao);
	
	void editar (MovimentacaoEntity movimentacao);
	
	void excluir (Long id);
	
	MovimentacaoEntity buscarId(Long id);
	
	List<MovimentacaoEntity> buscarTodos();

}
