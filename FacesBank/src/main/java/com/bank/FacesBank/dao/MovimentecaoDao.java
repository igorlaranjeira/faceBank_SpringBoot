package com.bank.FacesBank.dao;

import java.util.List;

import com.bank.FacesBank.domain.MovimentacaoEntity;

public interface MovimentecaoDao {

	void save(MovimentacaoEntity movimentacao);
	
	void update(MovimentacaoEntity movimentacao);
	
	void delete(Long id);
	
	MovimentacaoEntity findById(long id);
	
	List<MovimentacaoEntity> findAll();
}
