package com.Dao;
import com.entidades.TipoDocumentoUFPS;
import com.util.ConexionT;
import com.util.GenericT;

public class TipoDocumentoDao extends ConexionT<TipoDocumentoUFPS> implements GenericT<TipoDocumentoUFPS>  {

	public TipoDocumentoDao(){
		super(TipoDocumentoUFPS.class);
	}

}
