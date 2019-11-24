package com.bank.FacesBank.dao.impl;

import org.springframework.stereotype.Repository;

import com.bank.FacesBank.dao.AbstractDao;
import com.bank.FacesBank.dao.CargoDao;
import com.bank.FacesBank.domain.CargoEntity;

@Repository
public class CargoDaoImpl extends AbstractDao<CargoEntity, Long> implements CargoDao {

	@Override
	public CargoEntity findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
