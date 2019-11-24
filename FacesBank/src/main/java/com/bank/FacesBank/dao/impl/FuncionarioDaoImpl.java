package com.bank.FacesBank.dao.impl;

import org.springframework.stereotype.Repository;

import com.bank.FacesBank.dao.AbstractDao;
import com.bank.FacesBank.dao.FuncionarioDao;
import com.bank.FacesBank.domain.FuncionarioEntity;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<FuncionarioEntity, Long> implements FuncionarioDao {

	@Override
	public FuncionarioEntity findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
