package br.com.facesBank.dao;
import java.util.List;

import br.com.facesBank.domain.ContaEntity;

public interface ContaDao {

void save(ContaEntity conta);
	
	void update(ContaEntity conta);
	
	void delete(Long id);
	
	ContaEntity findById(long id);
	
	List<ContaEntity> findAll();
}
