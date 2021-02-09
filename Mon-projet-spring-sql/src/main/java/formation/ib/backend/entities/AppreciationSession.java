package formation.ib.backend.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appreciation_session")
public class AppreciationSession {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "qualite_accueil")
	private int qualiteAccueil;
	
	@Column(name = "qualite_environnement")
	private int qualiteEnvironnement;
	
	@Column(name = "satisfaction_stagiaire")
	private int satisfactionStagiaire;
	
	@Column(name = "recommande_formation")
	private Boolean recommandeFormation;
	
	@Column(name = "projet_formation")
	private Boolean projetFormation;
	
	@Column(name = "date")
	private Date date;
	
}
