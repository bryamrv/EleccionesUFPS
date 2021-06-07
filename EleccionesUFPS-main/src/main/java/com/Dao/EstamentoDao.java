package com.Dao;

import com.entidades.EstamentoUFPS;
import com.util.conexion;
import com.util.ConexionT;
import com.util.ConnectionGeneric;
import com.util.GenericT;

public class EstamentoDao extends ConexionT<EstamentoUFPS> implements GenericT<EstamentoUFPS>  {

	public EstamentoDao(){
		super(EstamentoUFPS.class);
	}

}
