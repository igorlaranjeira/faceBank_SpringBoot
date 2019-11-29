package br.com.facesBank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.facesBank.dao.EnderecoDao;
import br.com.facesBank.domain.EnderecoEntity;
import br.com.facesBank.service.EnderecoService;

@Service
@Transactional
public class EnderecoServiceImpl implements EnderecoService{

	@Autowired
	private EnderecoDao dao;
	
	
	@Override
	public void salvar(EnderecoEntity endereco) {
		dao.save(endereco);
	}

	@Override
	public void editar(EnderecoEntity endereco) {
		dao.update(endereco);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public EnderecoEntity buscarId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<EnderecoEntity> buscarTodos() {
		return dao.findAll();
	}

}
