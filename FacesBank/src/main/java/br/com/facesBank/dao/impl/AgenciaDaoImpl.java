package br.com.facesBank.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.facesBank.dao.AbstractDao;
import br.com.facesBank.dao.AgenciaDao;
import br.com.facesBank.domain.AgenciaEntity;

@Repository
public class AgenciaDaoImpl extends AbstractDao<AgenciaEntity, Long> implements AgenciaDao{

	@Override
	public AgenciaEntity findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
