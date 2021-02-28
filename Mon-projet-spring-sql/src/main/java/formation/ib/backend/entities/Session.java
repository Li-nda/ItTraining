package formation.ib.backend.entities;


import java.util.List;

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
@Table(name = "session")
public class Session {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "prix_ht")
	private double prixHt;
	
	@Column(name = "date_debut")
	private String dateDebut;
	
	@Column(name = "date_fin")
	private String dateFin;
	
	@ManyToMany
	@JoinTable(
			name = "session_possede_participant",
			joinColumns = @JoinColumn(name = "session_id"),
			inverseJoinColumns = @JoinColumn(name = "participant_id"))
	private List<Participant> listParticipant;
	
	@OneToMany(targetEntity = AppreciationSession.class, mappedBy = "session")
	private List<AppreciationSession> appreciationSession;
	
	@ManyToOne @JoinColumn(name = "formation_id")
	private Formation formation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrixHt() {
		return prixHt;
	}

	public void setPrixHt(double prixHt) {
		this.prixHt = prixHt;
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

	public List<Participant> getListParticipant() {
		return listParticipant;
	}

	public void setListParticipant(List<Participant> listParticipant) {
		this.listParticipant = listParticipant;
	}

	public List<AppreciationSession> getAppreciationSession() {
		return appreciationSession;
	}

	public void setAppreciationSession(List<AppreciationSession> appreciationSession) {
		this.appreciationSession = appreciationSession;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}	
	
	
	
}
