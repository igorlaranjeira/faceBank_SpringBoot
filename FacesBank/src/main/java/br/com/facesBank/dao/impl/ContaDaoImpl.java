package br.com.facesBank.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.facesBank.dao.AbstractDao;
import br.com.facesBank.dao.ContaDao;
import br.com.facesBank.domain.ContaEntity;

@Repository
public class ContaDaoImpl extends AbstractDao<ContaEntity, Long>implements ContaDao{

	@Override
	public ContaEntity findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
