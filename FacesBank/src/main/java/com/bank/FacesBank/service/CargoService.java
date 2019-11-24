package com.bank.FacesBank.service;

import java.util.List;

import com.bank.FacesBank.domain.CargoEntity;

public interface CargoService {

	void salvar (CargoEntity cargo);
	
	void editar (CargoEntity cargo);
	
	void excluir (Long id);
	
	CargoEntity buscarId(Long id);
	
	List<CargoEntity> buscarTodos();

}
