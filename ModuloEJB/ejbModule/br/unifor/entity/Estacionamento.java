package br.unifor.entity;

import java.io.Serializable;

public class Estacionamento implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String codigo;

	public Long getId() {
		return id;
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
