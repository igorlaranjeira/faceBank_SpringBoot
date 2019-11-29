package br.com.facesBank.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.facesBank.dao.AbstractDao;
import br.com.facesBank.dao.ClienteDao;
import br.com.facesBank.domain.ClienteEntity;

@Repository
public class ClienteDaoImpl extends AbstractDao<ClienteEntity, Long> implements ClienteDao{

	@Override
	public ClienteEntity findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
