package br.edu.fa7.tecnicas.jdbc;


import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="AUTOR")
public class Autor {

	@Id
	@Column(name="AUTORID")
	private Integer autorid;
	
	@Column(name="NOME")
	private String nome;
	
	@Column(name="ENDERECO")
	private String endereco;
	
	@Column(name="SEXO")
	private String sexo;
	
	@Column(name="DATA_NASCIMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data_nascimento;
	

	private Usuario usuario;

	public Integer getAutorid() {
		return autorid;
	}

	public void setAutorid(Integer autorid) {
		this.autorid = autorid;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Calendar getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Calendar data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	
	

	public Autor() {
	}

	public Autor(Integer autorid, String nome, String endereco, String sexo,
			Calendar data_nascimento) {
		this.autorid = autorid;
		this.nome = nome;
		this.endereco = endereco;
		this.sexo = sexo;
		this.data_nascimento = data_nascimento;
	}
	
	
}
