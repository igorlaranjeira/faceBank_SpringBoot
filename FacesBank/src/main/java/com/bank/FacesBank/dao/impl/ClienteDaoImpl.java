package com.bank.FacesBank.dao.impl;

import org.springframework.stereotype.Repository;

import com.bank.FacesBank.dao.AbstractDao;
import com.bank.FacesBank.dao.ClienteDao;
import com.bank.FacesBank.domain.ClienteEntity;

@Repository
public class ClienteDaoImpl extends AbstractDao<ClienteEntity, Long> implements ClienteDao{

	@Override
	public ClienteEntity findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
