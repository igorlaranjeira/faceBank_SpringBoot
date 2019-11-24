package com.bank.FacesBank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.FacesBank.dao.AgenciaDao;
import com.bank.FacesBank.domain.AgenciaEntity;
import com.bank.FacesBank.service.AgenciaService;

@Service
@Transactional
public class AgenciaServiceImpl implements AgenciaService {

	@Autowired
	private AgenciaDao dao;
	
	
	@Override
	public void salvar(AgenciaEntity agencia) {
		dao.save(agencia);	
	}

	@Override
	public void editar(AgenciaEntity agencia) {
		dao.update(agencia);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public AgenciaEntity buscarId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<AgenciaEntity> buscarTodos() {
		return dao.findAll();
	}

}
