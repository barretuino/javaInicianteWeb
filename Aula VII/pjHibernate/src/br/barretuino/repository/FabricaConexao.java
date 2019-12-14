package br.barretuino.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.cfg.Configuration;

public class FabricaConexao {
	public static EntityManagerFactory retornaPersistenceUnit(String unit) {
		return Persistence.createEntityManagerFactory(unit);
	}
	
	public static void main(String[] args) {
		EntityManagerFactory emf = FabricaConexao.retornaPersistenceUnit("pjextensao");
		EntityManager em = emf.createEntityManager();
		
		if(em != null) {
			System.out.println("Conexão realizada com sucesso!");
		}
		
		em.close();
		emf.close();
	}
}