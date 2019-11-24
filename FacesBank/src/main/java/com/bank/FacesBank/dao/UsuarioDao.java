package com.bank.FacesBank.dao;

import java.util.List;

import com.bank.FacesBank.domain.UsuarioEntity;

public interface UsuarioDao {

	void save(UsuarioEntity usuario);
	
	void update(UsuarioEntity usuario);
	
	void delete(Long id);
	
	UsuarioEntity findById(long id);
	
	List<UsuarioEntity> findAll();
}
