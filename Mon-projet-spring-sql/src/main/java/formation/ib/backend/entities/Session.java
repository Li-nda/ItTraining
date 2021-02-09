package formation.ib.backend.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private Date dateDebut;
	
	@Column(name = "date_fin")
	private Date dateFin;
	
	//List<Participant> listParticipant;

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

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

//	public List<Participant> getListParticipant() {
//		return listParticipant;
//	}
//
//	public void setListParticipant(List<Participant> listParticipant) {
//		this.listParticipant = listParticipant;
//	}	
	
}
