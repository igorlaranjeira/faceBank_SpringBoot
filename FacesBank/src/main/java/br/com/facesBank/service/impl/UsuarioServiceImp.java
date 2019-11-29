package br.com.facesBank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.facesBank.dao.UsuarioDao;
import br.com.facesBank.domain.UsuarioEntity;
import br.com.facesBank.service.UsuarioService;

@Service
@Transactional
public class UsuarioServiceImp implements UsuarioService{

	@Autowired
	private UsuarioDao dao;
	
	@Override
	public void salvar(UsuarioEntity usuario) {
		dao.save(usuario);
	}

	@Override
	public void editar(UsuarioEntity usuario) {
		dao.update(usuario);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public UsuarioEntity buscarId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<UsuarioEntity> buscarTodos() {
		return dao.findAll();
	}

}
