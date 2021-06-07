package com.entidades;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class VotoUFPS implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private Integer id;
	@Column
	private Date fechaCreacion;
	@Column
	private Date fechaVoto;
	@Column
	private String uuid;
	@Column
	private String enlace;
	@Column
	private Integer estamento;
	@Column
	private Integer candidato;
	@Column
	private Integer votante;
	
	public VotoUFPS() {
		
	}
	
	

	public VotoUFPS(Integer id, Date fechaCreacion, Date fechaVoto, String uuid, String enlace, Integer estamento,
			Integer candidato, Integer votante) {
		
		this.id = id;
		this.fechaCreacion = fechaCreacion;
		this.fechaVoto = fechaVoto;
		this.uuid = uuid;
		this.enlace = enlace;
		this.estamento = estamento;
		this.candidato = candidato;
		this.votante = votante;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaVoto() {
		return fechaVoto;
	}

	public void setFechaVoto(Date fechaVoto) {
		this.fechaVoto = fechaVoto;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getEnlace() {
		return enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

	public Integer getEstamento() {
		return estamento;
	}

	public void setEstamento(Integer estamento) {
		this.estamento = estamento;
	}

	public Integer getCandidato() {
		return candidato;
	}

	public void setCandidato(Integer candidato) {
		this.candidato = candidato;
	}

	public Integer getVotante() {
		return votante;
	}

	public void setVotante(Integer votante) {
		this.votante = votante;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "VotoUFPS [id=" + id + ", fechaCreacion=" + fechaCreacion + ", fechaVoto=" + fechaVoto + ", uuid=" + uuid
				+ ", enlace=" + enlace + ", estamento=" + estamento + ", candidato=" + candidato + ", votante="
				+ votante + "]";
	}
	
	
	
	

}
