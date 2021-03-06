package br.com.facesBank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.facesBank.dao.MovimentacaoDao;
import br.com.facesBank.domain.MovimentacaoEntity;
import br.com.facesBank.service.MovimentacaoService;

@Service
@Transactional
public class MovimentacaoServiceImpl implements MovimentacaoService{

	@Autowired
	private MovimentacaoDao dao;
	
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
