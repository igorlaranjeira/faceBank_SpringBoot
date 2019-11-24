package com.bank.FacesBank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.FacesBank.dao.CargoDao;
import com.bank.FacesBank.domain.CargoEntity;
import com.bank.FacesBank.service.CargoService;

@Service
@Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService{
	
	@Autowired
	private CargoDao dao;

	@Override
	public void salvar(CargoEntity cargo) {
		dao.save(cargo);
		
	}

	@Override
	public void editar(CargoEntity cargo) {
		dao.update(cargo);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public CargoEntity buscarId(Long id) {
		
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<CargoEntity> buscarTodos() {
		
		return dao.findAll();
	}

}
