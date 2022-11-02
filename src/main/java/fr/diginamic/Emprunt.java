package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
	@JoinColumn(name="ID_CLIENT")
		
	@ManyToMany
	@JoinTable(name="compo", 
	joinColumns= @JoinColumn(name="ID_EMP", referencedColumnName=
	"ID"),
	inverseJoinColumns= @JoinColumn(name="ID_CLI", referencedColumnName=
	"ID")
	)
	
	private Client client; 
}
