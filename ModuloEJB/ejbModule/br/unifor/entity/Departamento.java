package br.unifor.entity;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Departamento implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String codigo;

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
