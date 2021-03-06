package formation.ib.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	private String date;
	
//	@ManyToOne @JoinColumn(name = "session_id")
//	private Session session;
	
//	@ManyToOne @JoinColumn(name = "participant_id")
//	private Participant participant;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQualiteAccueil() {
		return qualiteAccueil;
	}

	public void setQualiteAccueil(int qualiteAccueil) {
		this.qualiteAccueil = qualiteAccueil;
	}

	public int getQualiteEnvironnement() {
		return qualiteEnvironnement;
	}

	public void setQualiteEnvironnement(int qualiteEnvironnement) {
		this.qualiteEnvironnement = qualiteEnvironnement;
	}

	public int getSatisfactionStagiaire() {
		return satisfactionStagiaire;
	}

	public void setSatisfactionStagiaire(int satisfactionStagiaire) {
		this.satisfactionStagiaire = satisfactionStagiaire;
	}

	public Boolean getRecommandeFormation() {
		return recommandeFormation;
	}

	public void setRecommandeFormation(Boolean recommandeFormation) {
		this.recommandeFormation = recommandeFormation;
	}

	public Boolean getProjetFormation() {
		return projetFormation;
	}

	public void setProjetFormation(Boolean projetFormation) {
		this.projetFormation = projetFormation;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

//	public Session getSession() {
//		return session;
//	}
//
//	public void setSession(Session session) {
//		this.session = session;
//	}

//	public Participant getParticipant() {
//		return participant;
//	}
//
//	public void setParticipant(Participant participant) {
//		this.participant = participant;
//	}
	
	
}
