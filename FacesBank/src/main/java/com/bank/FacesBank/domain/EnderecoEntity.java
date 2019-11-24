package com.bank.FacesBank.domain;

import javax.persistence.*;
import javax.persistence.Table;

import com.bank.FacesBank.util.UF;

@SuppressWarnings("serial")
@Entity
@Table(name = "tb_endereco")
public class EnderecoEntity extends AbstractEntity<Long>{

	@Column(name = "nm_longradoro",nullable = false)
	private String logradoro;
	
	@Column(name = "nm_bairro",nullable = false)
	private String bairro;
	
	@Column(name = "nm_cidade",nullable = false)
	private String cidade;
	
	@Column(name = "enu_uf", nullable = false, length = 2)
	@Enumerated(EnumType.STRING)
	private UF uf;
	
	@Column(name = "nu_cep",nullable = false, length = 9)
	private String cep;
	
	@Column(name = "nu_numero", nullable = false,length = 5)
	private Integer numero;
	
	@Column(name = "nm_complemento")
	private String complemento;

	public String getLogradoro() {
		return logradoro;
	}

	public void setLogradoro(String logradoro) {
		this.logradoro = logradoro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
}
