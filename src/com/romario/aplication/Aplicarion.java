package com.romario.aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.romario.aplication.domain.Cliente;

public class Aplicarion {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Pedro Bial");
		cliente.setIdade(40);
		cliente.setProfissao("Jornalista");
		cliente.setSexo("M");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();

		

		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();

		System.out.println("Cliente salvo com sucesso!");
		// em.close();
	}
}
