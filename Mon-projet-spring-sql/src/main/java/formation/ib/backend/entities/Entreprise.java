package formation.ib.backend.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="entreprise")


/**
 * Entreprise est table qui représente la structure qui fait la demande de formation pour ses employés 
 * Elle posséde une Id générée automatiquement, un numéro de Siret, émail, téléphone, nom, nom du correspondant
 * @author Mohammed TELIDJANE
 *
 */

public class Entreprise {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	@Column(name="siret")
	private String siret;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "telephone")
	private String  telephone;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "nomCorrespondant")
	private String nomCorrespondant;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNomCorrespondant() {
		return nomCorrespondant;
	}

	public void setNomCorrespondant(String nomCorrespondant) {
		this.nomCorrespondant = nomCorrespondant;
	}
	
	

}
