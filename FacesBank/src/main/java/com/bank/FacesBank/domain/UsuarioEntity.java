package com.bank.FacesBank.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="tb_usuario")
public class UsuarioEntity extends AbstractEntity<Long>{

	@Column(name="nm_usuario")
	String nomeUsuario;
	
	@Column(name = "de_login")
	private String login;
	
	@Column(name = "de_email")
	private String email;
	
	@Column(name = "de_senha")
	private String senha;
	
	@Column(name = "nu_cpf")
	private String cpf;
	
	@Column(name = "st_situacao")
	private Boolean situacao;
	
	@ManyToOne
	@JoinColumn(name = "id_cargo")
	private CargoEntity usuarioCargo;


	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Boolean getSituacao() {
		return situacao;
	}

	public void setSituacao(Boolean situacao) {
		this.situacao = situacao;
	}
	
	
	
}
