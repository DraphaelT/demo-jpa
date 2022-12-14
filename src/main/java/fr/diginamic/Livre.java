package fr.diginamic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="livre")
public class Livre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "TITRE", length = 255, nullable = false, unique = true)
	private String titre;
	@Column(name = "AUTEUR", length = 50, nullable = false)
	private String auteur;
	
	//IMPORTANT
	@ManyToMany
	@JoinTable(name="COMPO", 
	joinColumns= @JoinColumn(name="ID_LIV", referencedColumnName=
	"ID"),
	inverseJoinColumns= @JoinColumn(name="ID_EMP", referencedColumnName=
	"ID")
	)private List<Emprunt> emprunts = new ArrayList<Emprunt>();
	
	// constructeur sans argument
	public Livre() {
	}
	// getters and setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public List<Emprunt> getEmprunts() {
		return emprunts;
	}

	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + "]";
	}
	
}
