package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class ConnexionJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TP1
		/*
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("recensement");
			EntityManager em = entityManagerFactory.createEntityManager();
			
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			Region region1 = new Region();
			region1.setNom("Bretagne");
			em.persist(region1);
			
			transaction.commit();
			Region h = em.find(Region.class, 1);
		
			if (h != null){
				System.out.println(h.toString());
			}
			em.close();
			entityManagerFactory.close();
		 */
		//TP2
		/*
			EntityManagerFactory entityManagerFactory2 = Persistence.createEntityManagerFactory("bibliotheque");
			EntityManager biblio = entityManagerFactory2.createEntityManager();
			
			Livre livreTrouve = biblio.find(Livre.class, 1);
			
			if (livreTrouve != null){
				System.out.println(livreTrouve);
			}
			biblio.close();
			entityManagerFactory.close();
		*/
		//TP3
			
			EntityManagerFactory entityManagerFactory3 = Persistence.createEntityManagerFactory("bibliotheque");
			EntityManager emprunt = entityManagerFactory3.createEntityManager();
			
			Emprunt emp = emprunt.find(Emprunt.class, 1);
			Livre livre = emprunt.find(Livre.class, 1);
			
			if (emp != null){
				System.out.println(emp.toString());
			}
			
			//Demmande a la base de chercher les emprunts de ce livre
		   for(Emprunt empr :livre.getEmprunts()) {
			   System.out.println(empr+"\n");
		   }
		   System.out.println("\n");
		   for(Livre trouv :emp.getLivres()) {
			   System.out.println(trouv);
		   }
			
			emprunt.close();
			entityManagerFactory3.close();
			
	}

}
