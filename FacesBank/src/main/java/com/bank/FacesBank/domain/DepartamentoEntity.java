package com.bank.FacesBank.domain;

import java.util.List;

import javax.persistence.*;



@SuppressWarnings("serial")
@Entity
@Table(name = "tb_departamento")
public class DepartamentoEntity extends AbstractEntity<Long>{

	@Column(name = "nm_departamento", nullable = false, unique = true, length = 60)
	private String nome;

	@OneToMany(mappedBy = "nm_departamento")
	private List<CargoEntity> cargos;
	
	
	public List<CargoEntity> getCargos() {
		return cargos;
	}

	public void setCargos(List<CargoEntity> cargos) {
		this.cargos = cargos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
