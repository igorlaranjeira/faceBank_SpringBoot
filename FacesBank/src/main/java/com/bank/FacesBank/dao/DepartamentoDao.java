package com.bank.FacesBank.dao;

import java.util.List;

import com.bank.FacesBank.domain.DepartamentoEntity;

public interface DepartamentoDao {

	void save(DepartamentoEntity departamento);
	
	void update(DepartamentoEntity departamento);
	
	void delete(Long id);
	
	DepartamentoEntity findById(long id);
	
	List<DepartamentoEntity> findAll();
}
