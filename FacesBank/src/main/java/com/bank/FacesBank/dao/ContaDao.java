package com.bank.FacesBank.dao;

import java.util.List;

import com.bank.FacesBank.domain.ContaEntity;

public interface ContaDao {

void save(ContaEntity conta);
	
	void update(ContaEntity conta);
	
	void delete(Long id);
	
	ContaEntity findById(long id);
	
	List<ContaEntity> findAll();
}
