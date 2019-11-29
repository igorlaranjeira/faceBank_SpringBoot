package br.com.facesBank.dao;

import org.springframework.stereotype.Repository;

import br.com.facesBank.domain.ContaEntity;

@Repository
public class ContaDaoImpl extends AbstractDao<ContaEntity, Long>implements ContaDao{

	@Override
	public ContaEntity findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
