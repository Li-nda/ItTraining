package formation.ib.backend.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "participant")
/**
 * Cette classe représente un participant du centre de formation
 * Elle permet la création des objet de type Participant
 * @author IB
 *
 */
public class Participant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "prenom")
	private String prenom;
	
	@Column(name = "date_naissance")
	private String dateNaissance;
	
//	@OneToMany(targetEntity = AppreciationSession.class, mappedBy = "participant")
//	private List<AppreciationSession> appreciationSession;

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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

//	public List<AppreciationSession> getAppreciationSession() {
//		return appreciationSession;
//	}
//
//	public void setAppreciationSession(List<AppreciationSession> appreciationSession) {
//		this.appreciationSession = appreciationSession;
//	}
	
	
	
}
