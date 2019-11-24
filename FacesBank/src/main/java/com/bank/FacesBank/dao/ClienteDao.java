package com.bank.FacesBank.dao;

import java.util.List;

public interface ClienteDao {

void save(ClienteDao cliente);
	
	void update(ClienteDao cliente);
	
	void delete(Long id);
	
	ClienteDao findById(long id);
	
	List<ClienteDao> findAll();
}
