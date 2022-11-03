package fr.diginamic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.mapping.Collection;
import org.hibernate.mapping.List;

import fr.diginamic.Ville.Categories;

public class InsertionVilleJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactoryV = Persistence.createEntityManagerFactory("recensement");
		EntityManager emville = entityManagerFactoryV.createEntityManager();
		
		EntityTransaction transaction = emville.getTransaction();
		
		
		
		transaction.begin();
		Region region1 = new Region();
		region1.setNom("Corse");
		emville.persist(region1);
	
		Habitant h = new Habitant();
		
		h.setNom("IO");
		h.setPrenom("JEAN");
		
		emville.persist(h);
		
		Ville ville1 = new Ville();
		ville1.setNom("Imagination");
		ville1.setCodePostal(33550);
		ville1.setDate(new Date());
		ville1.setCat(Categories.Petite);
		ville1.setRegion(region1);
		emville.persist(ville1);
		
		Ville ville2 = new Ville();
		ville2.setNom("Paradis");
		ville2.setCodePostal(77777);
		ville2.setDate(new Date());
		ville2.setCat(Categories.Grande);
		ville2.setRegion(region1);
		ville1.getHabitants().add(h);
		ville2.getHabitants().add(h);
		emville.persist(ville2);
		
		transaction.commit();
		emville.close();
		entityManagerFactoryV.close();
		
	}

}
