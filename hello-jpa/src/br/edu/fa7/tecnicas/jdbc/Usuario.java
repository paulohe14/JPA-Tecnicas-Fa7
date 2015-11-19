package br.edu.fa7.tecnicas.jdbc;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Usuario {
	
	public static enum StatusType {
		Ativo, Inativo, Bloqueado
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String username;
	private String password;
	
	@Column(name = "creation_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar creationDate;
	
	@Enumerated(EnumType.STRING)
	private StatusType status;
	
	@OneToMany(cascade = CascadeType.PERSIST, mappedBy="usuario", fetch=FetchType.LAZY)
	private List<Vaga> vagas = new ArrayList<Vaga>();

	public Usuario() {
		
	}

	public Usuario(Integer id, String username, String password,
			Calendar creationDate, StatusType status, List<Vaga> vagas) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.creationDate = creationDate;
		this.status = status;
		this.vagas = vagas;
	}

	public List<Vaga> getVagas() {
		return vagas;
	}

	public void setVagas(List<Vaga> vagas) {
		this.vagas = vagas;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Calendar getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Calendar creationDate) {
		this.creationDate = creationDate;
	}
}
