package com.bank.FacesBank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.FacesBank.dao.MovimentecaoDao;
import com.bank.FacesBank.domain.MovimentacaoEntity;
import com.bank.FacesBank.service.MovimentacaoService;

@Service
@Transactional
public class MovimentacaoServiceImpl implements MovimentacaoService{

	@Autowired
	private MovimentecaoDao dao;
	
	@Override
	public void salvar(MovimentacaoEntity movimentacao) {
		dao.save(movimentacao);
	}

	@Override
	public void editar(MovimentacaoEntity movimentacao) {
		dao.update(movimentacao);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public MovimentacaoEntity buscarId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<MovimentacaoEntity> buscarTodos() {
		return dao.findAll();
	}

}
