package com.bank.FacesBank.dao;

import java.util.List;

import com.bank.FacesBank.domain.EnderecoEntity;

public interface EnderecoDao {

	void save(EnderecoEntity endereco);
	
	void update(EnderecoEntity endereco);
	
	void delete(Long id);
	
	EnderecoEntity findById(long id);
	
	List<EnderecoEntity> findAll();
}
