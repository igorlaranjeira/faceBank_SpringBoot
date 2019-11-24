package com.bank.FacesBank.dao;

import java.util.List;

import com.bank.FacesBank.domain.FuncionarioEntity;

public interface FuncionarioDao {

	void save(FuncionarioEntity funcionario);
	
	void update(FuncionarioEntity funcionario);
	
	void delete(Long id);
	
	FuncionarioEntity findById(long id);
	
	List<FuncionarioEntity> findAll();
}
