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
/*
@Entity
@Table (name="Emprunt")*/
public class Emprunt {/*
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
	
	@OneToMany(mappedBy="id")
	private Set<Client> client; 
	
	/*@ManyToMany
	@JoinTable(name="compo", 
	joinColumns= @JoinColumn(name="ID_EMP", referencedColumnName=
	"id"),
	inverseJoinColumns= @JoinColumn(name="ID_CLI", referencedColumnName=
	"id")
	)private Set<Emprunt> emprunts; */
	
	
}
