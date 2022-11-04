package fr.diginamic;

import java.util.ArrayList;
import java.util.List;
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

@Entity
@Table (name="Emprunt")
public class Emprunt {
	public Emprunt() {
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "DATE_DEBUT" , nullable = false, unique = true)
	private String dateDebut;
	@Column(name = "DATE_FIN",  nullable = false)
	private String dateFin;
	@Column(name = "DELAI", length=10, nullable = false)
	private String delai;
	
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client client;
	
	//Important pour pouvoir naviguer dans la base pls facilement (IMPORTANT)
	@ManyToMany(mappedBy = "emprunts")
	private List<Livre> livres = new ArrayList<Livre>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public String getDelai() {
		return delai;
	}

	public void setDelai(String delai) {
		this.delai = delai;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Livre> getLivres() {
		return livres;
	}

	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", delai=" + delai
				+ ", client=" + client;
	} 
	
	
}
