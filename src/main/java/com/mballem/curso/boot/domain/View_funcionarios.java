package com.mballem.curso.boot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

@SuppressWarnings("serial")
@Entity
@Table(name = "VW_FUNCIONARIOS")
public class View_funcionarios extends AbstractEntity<Long> {
	
	@Column(name = "Nome")
	private String nome;
	
	@Column(name = "Cargo")
	private String cargo;
	
	@Column(name = "Departamento")
	private String departamento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	

}
