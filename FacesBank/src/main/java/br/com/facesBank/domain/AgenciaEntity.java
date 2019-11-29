package br.com.facesBank.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "tb_agencia")
public class AgenciaEntity extends AbstractEntity<Long>{


	@Column(name="nm_agencia")
	private String nomeAgencia;
	
	@Column(name = "nu_agencia")
	private int numeroAgencia;
	
	@OneToOne
	@JoinColumn(name = "id_endereco_fk")
	private EnderecoEntity enderecoAgencia;

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public EnderecoEntity getEnderecoAgencia() {
		return enderecoAgencia;
	}

	public void setEnderecoAgencia(EnderecoEntity enderecoAgencia) {
		this.enderecoAgencia = enderecoAgencia;
	}
	


}
	