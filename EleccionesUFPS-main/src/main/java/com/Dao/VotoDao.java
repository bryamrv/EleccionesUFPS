package com.Dao;
import com.entidades.VotoUFPS;
import com.util.ConexionT;
import com.util.GenericT;

public class VotoDao extends ConexionT<VotoUFPS> implements GenericT<VotoUFPS>  {

	public VotoDao(){
		super(VotoUFPS.class);
	}

}

