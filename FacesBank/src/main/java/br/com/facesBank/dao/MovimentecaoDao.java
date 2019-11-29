package br.com.facesBank.dao;

import java.util.List;

import br.com.facesBank.domain.MovimentacaoEntity;

public interface MovimentecaoDao {

	void save(MovimentacaoEntity movimentacao);
	
	void update(MovimentacaoEntity movimentacao);
	
	void delete(Long id);
	
	MovimentacaoEntity findById(long id);
	
	List<MovimentacaoEntity> findAll();
}
