package com.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EstamentoUFPS implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private Integer id;
	@Column
	private Integer eleccion;
	@Column
	private String descripcion;

	public EstamentoUFPS() {
	
	}

	public EstamentoUFPS(Integer id, Integer eleccion, String descripcion) {
		
		this.id = id;
		this.eleccion = eleccion;
		this.descripcion = descripcion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEleccion() {
		return eleccion;
	}

	public void setEleccion(Integer eleccion) {
		this.eleccion = eleccion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "EstamentoUFPS [id=" + id + ", eleccion=" + eleccion + ", descripcion=" + descripcion + "]";
	}

	




}
