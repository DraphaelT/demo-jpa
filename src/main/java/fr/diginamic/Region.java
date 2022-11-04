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
@Table(name="region")
public class Region {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "NOM", length = 20, nullable = false, unique = true)
	private String nom;
	
	
	@OneToMany(mappedBy = "region")
	private Set<Ville> listVille;
	
	
	
	// constructeur sans argument
	public Region() {
	}
	// getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Region [id=" + id + ", nom=" + nom + "]";
	}
	public Set<Ville> getListVille() {
		return listVille;
	}
	public void setListVille(Set<Ville> listVille) {
		this.listVille = listVille;
	}
}
