package com.bank.FacesBank.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "tb_cliente")
public class ClienteEntity extends AbstractEntity<Long>{
	
	@Column(name = "nm_cliente")
	private String nomeCliente;
	
	@Column(name = "nu_cpf")
	private String cpfCliente;
	
	@Column(name = "en_endereco")
	private String endereçoCliente;

	@Column(name = "nu_telefone")
	private String telefone;
	
	@Column(name = "en_situacao")
	private boolean situacao;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getEndereçoCliente() {
		return endereçoCliente;
	}

	public void setEndereçoCliente(String endereçoCliente) {
		this.endereçoCliente = endereçoCliente;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	
	
	
}