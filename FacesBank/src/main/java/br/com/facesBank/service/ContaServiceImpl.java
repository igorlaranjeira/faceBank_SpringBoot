package br.com.facesBank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.FacesBank.dao.ContaDao;

import br.com.facesBank.domain.ContaEntity;

@Service
@Transactional
public class ContaServiceImpl implements ContaService{

	@Autowired
	private ContaDao dao;
	
	@Override
	public void salvar(ContaEntity conta) {
		dao.save(conta);
	}

	@Override
	public void editar(ContaEntity conta) {
		dao.update(conta);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public ContaEntity buscarId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<ContaEntity> buscarTodos() {
		return dao.findAll();
	}

}
