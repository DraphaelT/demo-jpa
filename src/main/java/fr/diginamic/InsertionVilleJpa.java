package fr.diginamic;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.diginamic.Ville.Categories;

public class InsertionVilleJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactoryV = Persistence.createEntityManagerFactory("recensement");
		EntityManager emville = entityManagerFactoryV.createEntityManager();
		
		EntityTransaction transaction = emville.getTransaction();
		
		transaction.begin();
		
		Ville ville1 = new Ville();
		ville1.setNom("Imagination");
		ville1.setCodePostal(33550);
		ville1.setDate(new Date());
		ville1.setCat(Categories.Petite);
		emville.persist(ville1);
		
		Ville ville2 = new Ville();
		ville2.setNom("Paradis");
		ville2.setCodePostal(77777);
		ville2.setDate(new Date());
		ville2.setCat(Categories.Grande);
		emville.persist(ville2);
		
		transaction.commit();
		emville.close();
		entityManagerFactoryV.close();
		
	}

}
