package com.bank.FacesBank.dao.impl;

import org.springframework.stereotype.Repository;

import com.bank.FacesBank.dao.AbstractDao;
import com.bank.FacesBank.dao.MovimentecaoDao;
import com.bank.FacesBank.domain.MovimentacaoEntity;

@Repository
public class MovimentacaoDaoImpl  extends AbstractDao<MovimentacaoEntity, Long>implements MovimentecaoDao{

	@Override
	public MovimentacaoEntity findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
