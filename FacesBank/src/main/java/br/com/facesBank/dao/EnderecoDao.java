package br.com.facesBank.dao;

import java.util.List;

import br.com.facesBank.domain.EnderecoEntity;

public interface EnderecoDao {

	void save(EnderecoEntity endereco);
	
	void update(EnderecoEntity endereco);
	
	void delete(Long id);
	
	EnderecoEntity findById(long id);
	
	List<EnderecoEntity> findAll();
}
