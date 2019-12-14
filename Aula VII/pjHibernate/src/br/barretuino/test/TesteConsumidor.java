package br.barretuino.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.barretuino.modelagem.Consumidor;
import br.barretuino.repository.FabricaConexao;

public class TesteConsumidor {
	public static void main(String[] args) {
		//Estabelecendo minha conexão
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pjextensao");
		
		//Criando um manager da conexão
		EntityManager em = emf.createEntityManager();
		
		//Transiente
		Consumidor entidade = new Consumidor();
		//entidade.setId(1);
		entidade.setNome("Renan Pereira");
		entidade.setIdade(21);
		entidade.setEndereco("R: Almir Santos, 100 - Centro");
		entidade.setSalario(12_000d);
		
		//Persistente		
		em.getTransaction().begin();			
		em.persist(entidade);
		em.getTransaction().commit();
		System.out.println("Consumidor inserido com sucesso!");
		
		//Consultar
		Consumidor teste = em.find(Consumidor.class, 2);
		System.out.println(teste.getNome());
		
	em.remove(teste);	
	em.getFlushMode();
	}
}
