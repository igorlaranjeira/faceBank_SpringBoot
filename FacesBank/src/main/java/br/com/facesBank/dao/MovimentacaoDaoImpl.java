package br.com.facesBank.dao;

import org.springframework.stereotype.Repository;

import br.com.facesBank.domain.MovimentacaoEntity;

@Repository
public class MovimentacaoDaoImpl  extends AbstractDao<MovimentacaoEntity, Long>implements MovimentecaoDao{

	@Override
	public MovimentacaoEntity findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
