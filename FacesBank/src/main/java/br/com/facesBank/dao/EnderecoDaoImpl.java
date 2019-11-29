package br.com.facesBank.dao;

import org.springframework.stereotype.Repository;

import br.com.facesBank.domain.EnderecoEntity;

@Repository
public class EnderecoDaoImpl extends AbstractDao<EnderecoEntity, Long> implements EnderecoDao{

	@Override
	public EnderecoEntity findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
