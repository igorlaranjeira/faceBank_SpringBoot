package br.com.facesBank.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.facesBank.dao.AbstractDao;
import br.com.facesBank.dao.EnderecoDao;
import br.com.facesBank.domain.EnderecoEntity;

@Repository
public class EnderecoDaoImpl extends AbstractDao<EnderecoEntity, Long> implements EnderecoDao{

	@Override
	public EnderecoEntity findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
