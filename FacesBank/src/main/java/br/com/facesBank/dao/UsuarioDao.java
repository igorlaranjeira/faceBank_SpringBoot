package br.com.facesBank.dao;

import java.util.List;

import br.com.facesBank.domain.UsuarioEntity;

public interface UsuarioDao {

	void save(UsuarioEntity usuario);
	
	void update(UsuarioEntity usuario);
	
	void delete(Long id);
	
	UsuarioEntity findById(long id);
	
	List<UsuarioEntity> findAll();
}
