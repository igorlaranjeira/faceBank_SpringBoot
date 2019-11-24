package com.bank.FacesBank.domain;

import java.util.List;

import javax.persistence.*;



@SuppressWarnings("serial")
@Entity
@Table(name = "tb_departamento")
public class DepartamentoEntity extends AbstractEntity<Long>{

	@Column(name = "nm_departamento", nullable = false, unique = true, length = 60)
	private String nome;

	@OneToMany(mappedBy = "departamento")
	private List<CargoEntity> cargo;
	
	
	public List<CargoEntity> getCargos() {
		return cargo;
	}

	public void setCargos(List<CargoEntity> cargos) {
		this.cargo = cargos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
