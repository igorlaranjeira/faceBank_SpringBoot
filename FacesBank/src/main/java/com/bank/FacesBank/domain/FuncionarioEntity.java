package com.bank.FacesBank.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "tb_funcionario")
public class FuncionarioEntity extends AbstractEntity<Long>{

	@Column(name = "nm_funcionario",nullable = false, unique = true)
	private String nome;
	
	@Column(name = "vl_salario", nullable = false,columnDefinition = "DECIMAL(7,2)")
	private BigDecimal salrio;
	
	@Column(name = "dt_entrada", nullable = false,columnDefinition = "DATE")
	private LocalDate dataEntrada;
	
	@Column(name = "dt_saida", columnDefinition = "DATE")
	private LocalDate datasaida;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_endereco_fk")
	private EnderecoEntity endereco;
	
	@ManyToOne()
	@JoinColumn(name = "id_cargo_fk")
	private CargoEntity cargo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalrio() {
		return salrio;
	}

	public void setSalrio(BigDecimal salrio) {
		this.salrio = salrio;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDate getDatasaida() {
		return datasaida;
	}

	public void setDatasaida(LocalDate datasaida) {
		this.datasaida = datasaida;
	}

	public EnderecoEntity getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoEntity endereco) {
		this.endereco = endereco;
	}

	public CargoEntity getCargo() {
		return cargo;
	}

	public void setCargo(CargoEntity cargo) {
		this.cargo = cargo;
	}
	
	
}
