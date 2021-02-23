package formation.ib.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "formation_personnalisee")
public class FormationPersonnalisee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "nombre_participant")
	private int nombreParticipant;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "siret")
	private String siret;
	
	@Column(name = "adresse")
	private String adresse;
	
	@Column(name = "theme")
	private String theme;
	
	@Column(name = "sous_theme")
	private String sousTheme;
	
	@Column(name = "description_besoin")
	private String descriptionBesoin;
	
	@Column(name = "statut_demande")
	private String statutDemande;
	
	@Column(name = "cout_formation_ht")
	private double coutFormationHt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNombreParticipant() {
		return nombreParticipant;
	}

	public void setNombreParticipant(int nombreParticipant) {
		this.nombreParticipant = nombreParticipant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getSousTheme() {
		return sousTheme;
	}

	public void setSousTheme(String sousTheme) {
		this.sousTheme = sousTheme;
	}

	public String getDescriptionBesoin() {
		return descriptionBesoin;
	}

	public void setDescriptionBesoin(String descriptionBesoin) {
		this.descriptionBesoin = descriptionBesoin;
	}

	public String getStatutDemande() {
		return statutDemande;
	}

	public void setStatutDemande(String statutDemande) {
		this.statutDemande = statutDemande;
	}

	public double getCoutFormationHt() {
		return coutFormationHt;
	}

	public void setCoutFormationHt(double coutFormationHt) {
		this.coutFormationHt = coutFormationHt;
	}
	
	

}
