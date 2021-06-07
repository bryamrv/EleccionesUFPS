package com.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TipoDocumentoUFPS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private Integer id;
	@Column
	private String descripcion;
	
	public TipoDocumentoUFPS() {
		
	}

	public TipoDocumentoUFPS(Integer id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		return "TipoDocumentoUFPS [id=" + id + ", descripcion=" + descripcion + "]";
	}
	
	

}
