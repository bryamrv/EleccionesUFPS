package com.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class VotanteUFPS implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private Integer id;
	@Column
	private String nombre;
	@Column
	private String email;
	@Column
	private String documento;
	@Column
	private Integer tipoDocumento;
	@Column
	private Integer eleccion;
	
	public VotanteUFPS() {
		
	}

	public VotanteUFPS(Integer id, String nombre, String email, String documento, Integer tipoDocumento,
			Integer eleccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.documento = documento;
		this.tipoDocumento = tipoDocumento;
		this.eleccion = eleccion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Integer getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(Integer tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Integer getEleccion() {
		return eleccion;
	}

	public void setEleccion(Integer eleccion) {
		this.eleccion = eleccion;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "VotanteUFPS [id=" + id + ", nombre=" + nombre + ", email=" + email + ", documento=" + documento
				+ ", tipoDocumento=" + tipoDocumento + ", eleccion=" + eleccion + "]";
	}
	
	
	

}
