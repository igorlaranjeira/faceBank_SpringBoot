package com.bank.FacesBank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.FacesBank.dao.DepartamentoDao;
import com.bank.FacesBank.domain.DepartamentoEntity;
import com.bank.FacesBank.service.DepartamentoService;

@Service
@Transactional
public class DepartamentoServiceImpl implements DepartamentoService{

	@Autowired
	private DepartamentoDao dao;
	
	@Override
	public void salvar(DepartamentoEntity departamento) {
		dao.save(departamento);
		
	}

	@Override
	public void editar(DepartamentoEntity departamento) {
		dao.update(departamento);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public DepartamentoEntity buscarId(Long id) {
		
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<DepartamentoEntity> buscarTodos() {
		
		return dao.findAll();
	}

}
