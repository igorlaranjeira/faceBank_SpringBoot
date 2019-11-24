package com.bank.FacesBank.domain;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.bank.FacesBank.util.TipoMovimentacao;
import com.bank.FacesBank.util.TipoDescricao;

@SuppressWarnings("serial")
@Entity
@Table(name = "tb_movimentacao")
public class MovimentacaoEntity extends AbstractEntity<Long>{
 
	@Column(name = "qt_valor")
	private BigDecimal valorMovimentacao;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tp_movimentacao")
	private TipoMovimentacao tipoMovimentacao;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_movimentacao")
	private Calendar dataMovimentacao;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "nm_descricao")
	private TipoDescricao descricaoMovimentacao;
	
	@ManyToOne
	@JoinColumn(name = "id_conta")
	private ContaEntity conta;

	
	public BigDecimal getValorMovimentacao() {
		return valorMovimentacao;
	}

	public void setValorMovimentacao(BigDecimal valorMovimentacao) {
		this.valorMovimentacao = valorMovimentacao;
	}

	public TipoMovimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}

	public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}

	public Calendar getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(Calendar dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public TipoDescricao getDescricaoMovimentacao() {
		return descricaoMovimentacao;
	}

	public void setDescricaoMovimentacao(TipoDescricao descricaoMovimentacao) {
		this.descricaoMovimentacao = descricaoMovimentacao;
	}

	public ContaEntity getConta() {
		return conta;
	}

	public void setConta(ContaEntity conta) {
		this.conta = conta;
	}

	
}
