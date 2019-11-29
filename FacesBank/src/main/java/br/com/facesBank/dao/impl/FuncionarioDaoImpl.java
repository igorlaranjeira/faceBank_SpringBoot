package br.com.facesBank.dao.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.facesBank.dao.AbstractDao;
import br.com.facesBank.dao.FuncionarioDao;
import br.com.facesBank.domain.FuncionarioEntity;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<FuncionarioEntity, Long> implements FuncionarioDao {

	public List<FuncionarioEntity> findByNome(String nome) {
		
		return createQuery("select f from Funcionario f where f.nome like concat('%',?1,'%') ", nome);
	}

	@Override
	public List<FuncionarioEntity> findByCargoId(Long id) {
		
		return createQuery("select f from Funcionario f where f.cargo.id = ?1", id);
	}

	@Override
	public List<FuncionarioEntity> findByDataEntradaDataSaida(LocalDate entrada, LocalDate saida) {
		String jpql = new StringBuilder("select f from Funcionario f ")
				.append("where f.dataEntrada >= ?1 and f.dataSaida <= ?2 ")
				.append("order by f.dataEntrada asc")
				.toString();
		return createQuery(jpql, entrada, saida);
	}

	@Override
	public List<FuncionarioEntity> findByDataEntrada(LocalDate entrada) {
		String jpql = new StringBuilder("select f from Funcionario f ")
				.append("where f.dataEntrada = ?1 ")
				.append("order by f.dataEntrada asc")
				.toString();
		return createQuery(jpql, entrada);
	}

	@Override
	public List<FuncionarioEntity> findByDataSaida(LocalDate saida) {
		String jpql = new StringBuilder("select f from Funcionario f ")
				.append("where f.dataSaida = ?1 ")
				.append("order by f.dataEntrada asc")
				.toString();
		return createQuery(jpql, saida);
	}	
	
}
