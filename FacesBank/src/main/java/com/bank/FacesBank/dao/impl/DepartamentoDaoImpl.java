package com.bank.FacesBank.dao.impl;

import org.springframework.stereotype.Repository;

import com.bank.FacesBank.dao.AbstractDao;
import com.bank.FacesBank.dao.DepartamentoDao;
import com.bank.FacesBank.domain.DepartamentoEntity;

@Repository
public class DepartamentoDaoImpl extends AbstractDao<DepartamentoEntity, Long> implements DepartamentoDao {

	@Override
	public DepartamentoEntity findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
