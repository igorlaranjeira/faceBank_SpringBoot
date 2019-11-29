package br.com.facesBank.dao;

import java.util.List;

import br.com.facesBank.domain.AgenciaEntity;

public interface AgenciaDao {

void save(AgenciaEntity agencia);
	
	void update(AgenciaEntity agencia);
	
	void delete(Long id);
	
	AgenciaEntity findById(long id);
	
	List<AgenciaEntity> findAll();
}
