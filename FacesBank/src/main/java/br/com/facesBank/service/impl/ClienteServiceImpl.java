package br.com.facesBank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.facesBank.dao.ClienteDao;
import br.com.facesBank.domain.ClienteEntity;
import br.com.facesBank.service.ClienteService;

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
