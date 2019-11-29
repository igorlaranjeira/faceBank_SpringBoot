package br.com.facesBank.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.facesBank.dao.AbstractDao;
import br.com.facesBank.dao.MovimentacaoDao;
import br.com.facesBank.domain.MovimentacaoEntity;

@Repository
public class MovimentacaoDaoImpl  extends AbstractDao<MovimentacaoEntity, Long>implements MovimentacaoDao{

	@Override
	public MovimentacaoEntity findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
