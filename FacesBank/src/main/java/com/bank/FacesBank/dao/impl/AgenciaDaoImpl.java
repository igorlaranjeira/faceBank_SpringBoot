package com.bank.FacesBank.dao.impl;

import org.springframework.stereotype.Repository;

import com.bank.FacesBank.dao.AbstractDao;
import com.bank.FacesBank.dao.AgenciaDao;
import com.bank.FacesBank.domain.AgenciaEntity;

@Repository
public class AgenciaDaoImpl extends AbstractDao<AgenciaEntity, Long> implements AgenciaDao{

	@Override
	public AgenciaEntity findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}