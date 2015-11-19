package br.edu.fa7.tecnicas.jdbc;

//import java.util.GregorianCalendar;
//import java.util.List;

//import javax.persistence.Query;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyJPAConnection {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("hello-jpa");

		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		/*
		Autor autor = new Autor(4, "Paulo", "Rua A", "M", new GregorianCalendar());
		em.persist(autor);
		*/
		/*
		Query query = em.createQuery("select a from Autor a");
		List<Autor> autores = query.getResultList();
		for(int i = 0; i < autores.size(); i++){
			System.out.println("autores: " + autores.);
		}
		*/
	
		em.getTransaction().commit();
		em.close();
		factory.close();

	}
}
