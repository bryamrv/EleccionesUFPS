package com.entidades;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Eleccion implements Serializable {
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
private String fechaIncio;
	@Column
private String fechaFin;
	@Column
private String cargo;

public Eleccion() {
	
}

public Eleccion(Integer id, String nombre, String fechaIncio, String fechaFin, String cargo) {
	
	this.id = id;
	this.nombre = nombre;
	this.fechaIncio = fechaIncio;
	this.fechaFin = fechaFin;
	this.cargo = cargo;
}

public Integer getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getFechaIncio() {
	return fechaIncio;
}

public void setFechaIncio(String fechaIncio) {
	this.fechaIncio = fechaIncio;
}

public String getFechaFin() {
	return fechaFin;
}

public void setFechaFin(String fechaFin) {
	this.fechaFin = fechaFin;
}

public String getCargo() {
	return cargo;
}

public void setCargo(String cargo) {
	this.cargo = cargo;
}

@Override
public String toString() {
	return "Eleccion [id=" + id + ", nombre=" + nombre + ", fechaIncio=" + fechaIncio + ", fechaFin=" + fechaFin
			+ ", cargo=" + cargo + "]";
}

public static long getSerialversionuid() {
	return serialVersionUID;
}




}
