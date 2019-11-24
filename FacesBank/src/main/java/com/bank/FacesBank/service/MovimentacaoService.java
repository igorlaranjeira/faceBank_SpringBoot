package com.bank.FacesBank.service;

import java.util.List;

import com.bank.FacesBank.domain.MovimentacaoEntity;

public interface MovimentacaoService {

	void salvar (MovimentacaoEntity movimentacao);
	
	void editar (MovimentacaoEntity movimentacao);
	
	void excluir (Long id);
	
	MovimentacaoEntity buscarId(Long id);
	
	List<MovimentacaoEntity> buscarTodos();

}
