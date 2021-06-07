package com.Dao;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entidades.CandidatoUFPS;

import com.util.ConnectionGeneric;
import com.util.QueryGeneric;

public class CandidatoDao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private QueryGeneric<CandidatoUFPS> query;

	public CandidatoDao() {
	}

	public List<CandidatoUFPS> list() {
		this.query = new QueryGeneric<CandidatoUFPS>();
		this.query.setQuery("SELECT * FROM candidato");
		this.query.setList(new ArrayList<CandidatoUFPS>());
		try {
			this.query.setPs(ConnectionGeneric.getC().prepareStatement(this.query.getQuery()));
			this.query.setRs(this.query.getPs().executeQuery());
			while (this.query.getRs().next()) {
				this.query.setEntity(new CandidatoUFPS());
				this.query.getEntity().setId(this.query.getRs().getInt(1));
				this.query.getEntity().setDocumento(this.query.getRs().getString(2));
				this.query.getEntity().setNombre(this.query.getRs().getString(3));
				this.query.getEntity().setApellido(this.query.getRs().getString(4));
				this.query.getEntity().setEleccion(this.query.getRs().getInt(5));
				this.query.getEntity().setNumero(this.query.getRs().getInt(6));
				this.query.getList().add(this.query.getEntity());
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			// ConnectionGeneric.close();
		}
		return this.query.getList();
	}
	
	public List<CandidatoUFPS> list(String id) {
		this.query = new QueryGeneric<CandidatoUFPS>();
		this.query.setQuery("SELECT * FROM candidato WHERE eleccion = "+id);
		this.query.setList(new ArrayList<CandidatoUFPS>());
		try {
			this.query.setPs(ConnectionGeneric.getC().prepareStatement(this.query.getQuery()));
			this.query.setRs(this.query.getPs().executeQuery());
			while (this.query.getRs().next()) {
				this.query.setEntity(new CandidatoUFPS());
				this.query.getEntity().setId(this.query.getRs().getInt(1));
				this.query.getEntity().setDocumento(this.query.getRs().getString(2));
				this.query.getEntity().setNombre(this.query.getRs().getString(3));
				this.query.getEntity().setApellido(this.query.getRs().getString(4));
				this.query.getEntity().setEleccion(this.query.getRs().getInt(5));
				this.query.getEntity().setNumero(this.query.getRs().getInt(6));
				this.query.getList().add(this.query.getEntity());
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			// ConnectionGeneric.close();
		}
		return this.query.getList();
	}
	
	public CandidatoUFPS find(String id) {
		this.query = new QueryGeneric<CandidatoUFPS>();
		this.query.setQuery("SELECT * FROM candidato WHERE id = "+id);
		try {
			this.query.setPs(ConnectionGeneric.getC().prepareStatement(this.query.getQuery()));
			this.query.setRs(this.query.getPs().executeQuery());
			while (this.query.getRs().next()) {
				this.query.setEntity(new CandidatoUFPS());
				this.query.getEntity().setId(this.query.getRs().getInt(1));
				this.query.getEntity().setDocumento(this.query.getRs().getString(2));
				this.query.getEntity().setNombre(this.query.getRs().getString(3));
				this.query.getEntity().setApellido(this.query.getRs().getString(4));
				this.query.getEntity().setEleccion(this.query.getRs().getInt(5));
				this.query.getEntity().setNumero(this.query.getRs().getInt(6));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			// ConnectionGeneric.close();
		}
		return this.query.getEntity();
	}
	
	
	

	public void insert(CandidatoUFPS t) {
		if (t != null) {
			this.query = new QueryGeneric<CandidatoUFPS>();
			this.query.setQuery(
					"INSERT INTO candidato(id,documento,nombre,apellido,eleccion,numero) VALUES (?,?,?,?,?,?)");
			try {
				this.query.setPs(ConnectionGeneric.getC().prepareStatement(this.query.getQuery()));
				this.query.getPs().setInt(1, t.getId());
				this.query.getPs().setString(2, t.getDocumento());
				this.query.getPs().setString(3, t.getNombre());
				this.query.getPs().setString(4, t.getApellido());
				this.query.getPs().setInt(5, t.getEleccion());
				this.query.getPs().setInt(6, t.getNumero());
				this.query.getPs().executeUpdate();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} finally {
				// ConnectionGeneric.close();
			}
		}
	}

	public void update(CandidatoUFPS t) {
		if (t != null) {
			this.query = new QueryGeneric<CandidatoUFPS>();
			this.query.setQuery(
					"UPDATE candidato SET documento = ?, nombre = ?, apellido = ?, eleccion = ?, numero = ?  WHERE id = "
							+ t.getId() + "");
			try {
				this.query.setPs(ConnectionGeneric.getC().prepareStatement(this.query.getQuery()));
				this.query.getPs().setString(1, t.getDocumento());
				this.query.getPs().setString(2, t.getNombre());
				this.query.getPs().setString(3, t.getApellido());
				this.query.getPs().setInt(4, t.getEleccion());
				this.query.getPs().setInt(5, t.getNumero());
				this.query.getPs().executeUpdate();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} finally {
				// ConnectionGeneric.close();
			}
		}
	}

	public boolean delete(int id) {
		if (id > 0) {
			this.query = new QueryGeneric<CandidatoUFPS>();
			query.setQuery("DELETE FROM candidato WHERE id = " + id + "");
			try {
				this.query.setPs(ConnectionGeneric.getC().prepareStatement(this.query.getQuery()));
				if (this.query.getPs().executeUpdate() > 0) {
					return true;
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} finally {
				ConnectionGeneric.close();
			}
		}
		return false;
	}

}
