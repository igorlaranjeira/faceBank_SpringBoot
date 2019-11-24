package com.bank.FacesBank.dao;

import java.util.List;

import com.bank.FacesBank.domain.CargoEntity;

public interface CargoDao {
	
	void save(CargoEntity cargo);
	
	void update(CargoEntity cargo);
	
	void delete(Long id);
	
	CargoEntity findById(long id);
	
	List<CargoEntity> findAll();
}
