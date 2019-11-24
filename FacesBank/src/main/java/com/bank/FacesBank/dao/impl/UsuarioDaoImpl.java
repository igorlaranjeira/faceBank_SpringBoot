package com.bank.FacesBank.dao.impl;

import org.springframework.stereotype.Repository;

import com.bank.FacesBank.dao.AbstractDao;
import com.bank.FacesBank.dao.UsuarioDao;
import com.bank.FacesBank.domain.UsuarioEntity;

@Repository
public class UsuarioDaoImpl extends AbstractDao<UsuarioEntity, Long> implements UsuarioDao {

	@Override
	public UsuarioEntity findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
