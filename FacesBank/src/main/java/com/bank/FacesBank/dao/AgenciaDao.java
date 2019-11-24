package com.bank.FacesBank.dao;

import java.util.List;

import com.bank.FacesBank.domain.AgenciaEntity;

public interface AgenciaDao {

void save(AgenciaEntity agencia);
	
	void update(AgenciaEntity agencia);
	
	void delete(Long id);
	
	AgenciaEntity findById(long id);
	
	List<AgenciaEntity> findAll();
}
