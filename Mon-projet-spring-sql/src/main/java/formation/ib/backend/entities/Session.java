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
/**
 * Cette classe représente une session du centre de formation
 * Elle permet la création des objet de type Session
 * @author IB
 *
 */
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

	@ManyToOne @JoinColumn(name = "formation_id")
	private Formation formation;

	@ManyToMany
	@JoinTable(
			name = "session_possede_participant",
			joinColumns = @JoinColumn(name = "session_id"),
			inverseJoinColumns = @JoinColumn(name = "participant_id"))
	private List<Participant> listParticipant;

	//	@OneToMany(targetEntity = AppreciationSession.class, mappedBy = "session")
	//	private List<AppreciationSession> appreciationSession;

	/**
	 * Méthode permettant de récupérer l'id de la session
	 * @return l'id de la session
	 */
	public int getId() {
		return id;
	}

	/**
	 * Méthode permettant de modifier l'id de la session
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Méthode permettant de récupérer le prix HT de la session
	 * @return le prix HT de la session
	 */
	public double getPrixHt() {
		return prixHt;
	}

	/**
	 * Méthode permettant de modifier le prix HT de la session
	 * @param prixHt
	 */
	public void setPrixHt(double prixHt) {
		this.prixHt = prixHt;
	}

	/**
	 * Méthode permettant de récupérer la date de début de la session
	 * @return la date de début de la session
	 */
	public String getDateDebut() {
		return dateDebut;
	}

	/**
	 * Méthode permettant de modifier la date de début de la session
	 * @param dateDebut
	 */
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * Méthode permettant de récupérer la date de fin de la session
	 * @return la date de fin de la session
	 */
	public String getDateFin() {
		return dateFin;
	}

	/**
	 * Méthode permettant de modifier la date de fin de la session
	 * @param dateFin
	 */
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * Méthode permettant de récupérer la liste des participants de la session
	 * @return la liste des participants de la session
	 */
	public List<Participant> getListParticipant() {
		return listParticipant;
	}

	/**
	 * Méthode permettant de récupérer la liste des participants de la session
	 * @param listParticipant
	 */
	public void setListParticipant(List<Participant> listParticipant) {
		this.listParticipant = listParticipant;
	}

	/**
	 * Méthode permettant de récupérer la formation de la session
	 * @return la formation de la session
	 */
	public Formation getFormation() {
		return formation;
	}

	/**
	 * Méthode permettant de modifier la liste des participants de la session
	 * @param formation
	 */
	public void setFormation(Formation formation) {
		this.formation = formation;
	}	

	//	public List<AppreciationSession> getAppreciationSession() {
	//	return appreciationSession;
	//}
	//
	//public void setAppreciationSession(List<AppreciationSession> appreciationSession) {
	//	this.appreciationSession = appreciationSession;
	//}

}
