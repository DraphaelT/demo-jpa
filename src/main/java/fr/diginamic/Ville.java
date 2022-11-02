package fr.diginamic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
}
