package fr.diginamic;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.mapping.List;

@Entity
@Table(name="region")
public class Region {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "NOM", length = 20, nullable = false, unique = true)
	private String nom;
	
	
	@OneToMany(mappedBy = "region")
	private Set<Ville> listVille;
	
	public Set<Ville> getListVille() {
		return listVille;
	}
	public void setListVille(Set<Ville> listVille) {
		this.listVille = listVille;
	}
	/*
	@ManyToMany
	@JoinTable(name="reg_vil", 
	joinColumns= @JoinColumn(name="ID_REG", referencedColumnName=
	"Id"),
	inverseJoinColumns= @JoinColumn(name="ID_VIL", referencedColumnName=
	"Id")
	)private Set<Ville> regVille; 
	*/
	// constructeur sans argument
	public Region() {
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
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Region [id=" + id + ", nom=" + nom + "]";
	}
	
}
