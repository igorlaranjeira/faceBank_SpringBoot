package com.bank.FacesBank.dao.impl;

import org.springframework.stereotype.Repository;

import com.bank.FacesBank.dao.AbstractDao;
import com.bank.FacesBank.dao.ContaDao;
import com.bank.FacesBank.domain.ContaEntity;

@Repository
public class ContaDaoImpl extends AbstractDao<ContaEntity, Long>implements ContaDao{

	@Override
	public ContaEntity findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
