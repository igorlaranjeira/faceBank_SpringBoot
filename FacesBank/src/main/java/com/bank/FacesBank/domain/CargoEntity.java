package com.bank.FacesBank.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cargo")
public class CargoEntity extends AbstractEntity<Long>{

	@Column(name = "nm_cargo", nullable = false, unique = true,length = 60)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "id_departamento_fk")
	private DepartamentoEntity departamento;

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
	
	
	
}
