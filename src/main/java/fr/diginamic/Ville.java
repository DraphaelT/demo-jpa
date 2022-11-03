package fr.diginamic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="Ville")
public class Ville {
	/**
	 * 
	 * @author Thomas
	 *
	 */
	enum Categories{
		Petite,
		Moyenne,
		Grande
	};
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "NOM", length = 20, nullable = false, unique = true)
	private String nom;
	@Column(name = "CODEPOSTAL", length = 20, nullable = false, unique = true)
	private int codePostal;
	@Temporal(value = TemporalType.DATE)
	private Date date;
	
	@Enumerated(EnumType.STRING)
	private Categories cat;
	
	
	@ManyToMany
	@JoinTable(name="Habitant_Vil", 
	joinColumns= @JoinColumn(name="ID_Ville", referencedColumnName=
	"ID"),
	inverseJoinColumns= @JoinColumn(name="ID_Habitant", referencedColumnName=
	"ID")
	)
	private List<Habitant> habitants = new ArrayList<Habitant>();
	
	public List<Habitant> getHabitants() {
		return habitants;
	}

	public void setHabitants(List<Habitant> habitants) {
		this.habitants = habitants;
	}

	@ManyToOne
	@JoinColumn(name = "Region")
	private Region region;
	/**
	 * 
	 *Constuteur
	 *
	 */
	
	Ville(){
		
	}

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

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Categories getCat() {
		return cat;
	}

	public void setCat(Categories cat) {
		this.cat = cat;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}


	
}
