package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entidades.CandidatoUFPS;
import com.util.ConnectionGeneric;

public class TestCandidato {

	private static EntityManager manager;
	private static EntityManagerFactory emf;
	
	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("EleccionesUFPS");
		manager =emf.createEntityManager();
		
		List<CandidatoUFPS> candidato=(List<CandidatoUFPS>)manager.createQuery("FROM CandidatoUFPS").getResultList();
		System.out.println("En esta base de datos hay " + candidato.size() + " Candidatos");
		ConnectionGeneric.connection();
	}
	
	
}
