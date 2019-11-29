package br.com.facesBank.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.facesBank.dao.FuncionarioDao;
import br.com.facesBank.domain.FuncionarioEntity;
import br.com.facesBank.service.FuncionarioService;

@Service
@Transactional(readOnly = true)
public class FuncionarioServiceImpl implements FuncionarioService {
	
	@Autowired
	private FuncionarioDao dao;

	@Transactional(readOnly = false)
	@Override
	public void salvar(FuncionarioEntity funcionario) {
		dao.save(funcionario);
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(FuncionarioEntity funcionario) {
		dao.update(funcionario);
	}

	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	public FuncionarioEntity buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override
	public List<FuncionarioEntity> buscarTodos() {
		
		return dao.findAll();
	}

	@Override
	public List<FuncionarioEntity> buscarPorNome(String nome) {
		
		return dao.findByNome(nome);
	}

	@Override
	public List<FuncionarioEntity> buscarPorCargo(Long id) {
		
		return dao.findByCargoId(id);
	}

	@Override
    public List<FuncionarioEntity> buscarPorDatas(LocalDate entrada, LocalDate saida) {
	    if (entrada != null && saida != null) {	    	
            return dao.findByDataEntradaDataSaida(entrada, saida);
        } else if (entrada != null) {        	
	        return dao.findByDataEntrada(entrada);
        } else if (saida != null) {        	
	        return dao.findByDataSaida(saida);
        } else {
        	return new ArrayList<>();
        }
    }
}
