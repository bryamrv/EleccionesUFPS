package com.Dao;
import com.entidades.VotanteUFPS;
import com.util.ConexionT;
import com.util.GenericT;

public class VotanteDao extends ConexionT<VotanteUFPS> implements GenericT<VotanteUFPS>  {

	public VotanteDao(){
		super(VotanteUFPS.class);
	}

	
}
