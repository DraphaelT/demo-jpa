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
			em.close();
			entityManagerFactory.close();
		//TP2
			
			EntityManagerFactory entityManagerFactory2 = Persistence.createEntityManagerFactory("bibliotheque");
			EntityManager biblio = entityManagerFactory2.createEntityManager();
			
			Livre livreTrouve = biblio.find(Livre.class, 1);
			
			if (livreTrouve != null){
				System.out.println(livreTrouve);
			}
			biblio.close();
			entityManagerFactory.close();
			
		//TP3
			EntityManagerFactory entityManagerFactory3 = Persistence.createEntityManagerFactory("bibliotheque");
			EntityManager emprunt = entityManagerFactory3.createEntityManager();
			
			TypedQuery<Emprunt> query2 = emprunt.createQuery("SELECT ID_LIV,livre.TITRE,ID_EMP FROM compo JOIN livre ON Emprunt.compo.ID_LIV = livre.ID WHERE ID_EMP = '1'", Emprunt.class);
			Emprunt h2 = query2.getResultList().get(0);
			
			if (h2 != null){
				System.out.println(h2);
			}
			emprunt.close();
			entityManagerFactory.close();
	}

}
