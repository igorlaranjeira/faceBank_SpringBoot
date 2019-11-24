package com.bank.FacesBank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.FacesBank.dao.FuncionarioDao;
import com.bank.FacesBank.domain.FuncionarioEntity;
import com.bank.FacesBank.service.FuncionarioService;

@Service
@Transactional
public class FuncionarioServiceImpl implements FuncionarioService{

	@Autowired
	private FuncionarioDao dao;
	
	@Override
	public void salvar(FuncionarioEntity funcionario) {
		dao.save(funcionario);
	}

	@Override
	public void editar(FuncionarioEntity funcionario) {
		dao.update(funcionario);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public FuncionarioEntity buscarId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<FuncionarioEntity> buscarTodos() {
		return dao.findAll();
	}

}
