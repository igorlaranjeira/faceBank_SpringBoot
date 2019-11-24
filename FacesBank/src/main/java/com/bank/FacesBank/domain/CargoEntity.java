package com.bank.FacesBank.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "tb_cargo")
public class CargoEntity extends AbstractEntity<Long>{

	@Column(name = "nm_cargo", nullable = false, unique = true,length = 60)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "id_departamento_fk")
	private DepartamentoEntity departamento;
	
	@OneToMany(mappedBy = "CargoEntity")
	private List<FuncionarioEntity> funcionario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DepartamentoEntity getDepartamento() {
		return departamento;
	}

	public void setDepartamento(DepartamentoEntity departamento) {
		this.departamento = departamento;
	}

	public List<FuncionarioEntity> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<FuncionarioEntity> funcionario) {
		this.funcionario = funcionario;
	}
	
	
	
	
}
