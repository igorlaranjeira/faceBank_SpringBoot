package com.bank.FacesBank.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bank.FacesBank.util.TipoDescricao;

@SuppressWarnings("serial")
@Entity
@Table(name = "tb_conta")
public class ContaEntity extends AbstractEntity<Long>{
	
	@Column(name = "nu_conta")
	private String numeroDeConta;
	
	@OneToOne
	@JoinColumn(name = "id_cliente_fk")
	private ClienteEntity clienteConta;
	
	@ManyToOne
	@JoinColumn(name = "id_agencia_fk")
	private AgenciaEntity agenciaConta;
	
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tp_conta")
	private TipoDescricao tipoConta;
	
	@Column(name = "nu_situacao")
	private boolean situacao;
	
	@Column(name = "vl_saldo")
	private BigDecimal saldo;
	

	public String getNumeroDeConta() {
		return numeroDeConta;
	}

	public void setNumeroDeConta(String numeroDeConta) {
		this.numeroDeConta = numeroDeConta;
	}

	public AgenciaEntity getAgenciaConta() {
		return agenciaConta;
	}

	public void setAgenciaConta(AgenciaEntity agenciaConta) {
		this.agenciaConta = agenciaConta;
	}

	public TipoDescricao getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoDescricao tipoConta) {
		this.tipoConta = tipoConta;
	}

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	
	
}
