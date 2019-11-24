package com.bank.FacesBank.dao;

import java.util.List;

import com.bank.FacesBank.domain.ClienteEntity;

public interface ClienteDao {

void save(ClienteEntity cliente);
	
	void update(ClienteEntity cliente);
	
	void delete(Long id);
	
	ClienteEntity findById(long id);
	
	List<ClienteEntity> findAll();
}
