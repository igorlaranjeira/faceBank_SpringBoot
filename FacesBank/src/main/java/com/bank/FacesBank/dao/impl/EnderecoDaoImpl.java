package com.bank.FacesBank.dao.impl;

import org.springframework.stereotype.Repository;

import com.bank.FacesBank.dao.AbstractDao;
import com.bank.FacesBank.dao.EnderecoDao;
import com.bank.FacesBank.domain.EnderecoEntity;

@Repository
public class EnderecoDaoImpl extends AbstractDao<EnderecoEntity, Long> implements EnderecoDao{

	@Override
	public EnderecoEntity findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
