package com.util;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionGeneric implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Connection c;

	public ConnectionGeneric() {

	}

	public static Connection connection() {
		if (c == null) {
			try {
				Class.forName(conexion.DRIVER_BD);
				c = (Connection) DriverManager.getConnection(conexion.URL_ONE, conexion.USER_BD, conexion.PASSWORD_BD);
				System.out.println("Exitosa");
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return c;
	}

	public static void close() {
		try {
			c.close();
			c = null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static Connection getC() {
		return c;
	}

	public static void setC(Connection c) {
		ConnectionGeneric.c = c;
	}

}
