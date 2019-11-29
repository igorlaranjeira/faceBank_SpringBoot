package br.com.facesBank.dao;

import java.util.List;

import br.com.facesBank.domain.ClienteEntity;

public interface ClienteDao {

void save(ClienteEntity cliente);
	
	void update(ClienteEntity cliente);
	
	void delete(Long id);
	
	ClienteEntity findById(long id);
	
	List<ClienteEntity> findAll();
}
