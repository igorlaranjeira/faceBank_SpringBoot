package br.com.facesBank.service;

import java.util.List;

import br.com.facesBank.domain.CargoEntity;

public interface CargoService {

	void salvar(CargoEntity cargo);
	
	void editar(CargoEntity cargo);
	
	void excluir(Long id);
	
	CargoEntity buscarPorId(Long id);
	
	List<CargoEntity> buscarTodos();
	
	boolean cargoTemFuncionarios(Long id);
}
