package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class ConnexionJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TP1
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("recensement");
			EntityManager em = entityManagerFactory.createEntityManager();
			
			Region h = em.find(Region.class, 1);
		
			if (h != null){
				System.out.println(h);
			}
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			Region region1 = new Region();
			region1.setNom("Corse");
			em.persist(region1);
			transaction.commit();
			
		//TP2
			
			EntityManagerFactory entityManagerFactory2 = Persistence.createEntityManagerFactory("bibliotheque");
			EntityManager biblio = entityManagerFactory2.createEntityManager();
			
			Livre livreTrouve = biblio.find(Livre.class, 1);
			
			if (livreTrouve != null){
				System.out.println(livreTrouve);
			}
	}

}
