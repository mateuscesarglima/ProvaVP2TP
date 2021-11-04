package br.edu.uni7.jpa;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.uni7.jpa.Projeto.ProjetoAreaType;
import br.edu.uni7.jpa.Usuario.StatusType;

public class DatabaseGen {
	public static void main(String[] args) {
		Properties config = new Properties();
		config.put("hibernate.hbm2ddl.auto", "create");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("uni7-pu", config);
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		
		Usuario u1 = new Professor(null,"Teuszin de mel", "123123","Fessor de TP", 1.2);
		

		
		Projeto projeto1 = new Projeto(null,"Baixaria", ProjetoAreaType.INFRA);
		Projeto projeto2 = new Projeto(null,"Putarias", ProjetoAreaType.UX);
		
		em.persist(projeto2);
		em.persist(projeto1);
		em.persist(u1);
	
		em.getTransaction().commit();
		Usuario f1 = new Funcionario(null,"Teuszin","sein","sein","seintb");
		em.persist(f1);
		em.close();
		factory.close();
	}
}