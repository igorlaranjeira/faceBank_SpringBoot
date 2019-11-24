package com.bank.FacesBank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.FacesBank.dao.ClienteDao;
import com.bank.FacesBank.domain.ClienteEntity;
import com.bank.FacesBank.service.ClienteService;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteDao dao;
	
	@Override
	public void salvar(ClienteEntity cliente) {
		dao.save(cliente);
	}

	@Override
	public void editar(ClienteEntity cliente) {
		dao.update(cliente);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public ClienteEntity buscarId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<ClienteEntity> buscarTodos() {
		return dao.findAll();
	}

}
