package br.com.facesBank.dao;

import java.time.LocalDate;
import java.util.List;

import br.com.facesBank.domain.FuncionarioEntity;

public interface FuncionarioDao {
    
	void save(FuncionarioEntity funcionario);

    void update(FuncionarioEntity funcionario);

    void delete(Long id);

    FuncionarioEntity findById(Long id);

    List<FuncionarioEntity> findAll();
    
    List<FuncionarioEntity> findByNome(String nome);

	List<FuncionarioEntity> findByCargoId(Long id);

	List<FuncionarioEntity> findByDataEntradaDataSaida(LocalDate entrada, LocalDate saida);

	List<FuncionarioEntity> findByDataEntrada(LocalDate entrada);

	List<FuncionarioEntity> findByDataSaida(LocalDate saida);
}
