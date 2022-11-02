package fr.diginamic;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "NOM", length = 255, nullable = false, unique = true)
	private String nom;
	@Column(name = "PRENOM", length = 50, nullable = false)
	private String prenom;
	
	@OneToMany(mappedBy="client")
	private Set<Emprunt> chambres;
	
	// constructeur sans argument
	public Client() {
	}
	// getters and setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String titre) {
		this.nom = titre;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String auteur) {
		this.prenom = auteur;
	}
	
}
