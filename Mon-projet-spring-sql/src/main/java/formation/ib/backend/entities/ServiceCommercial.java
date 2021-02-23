package formation.ib.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "service_commercial")
public class ServiceCommercial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "chiffre_affaire_annuel")
	private double chiffreAffaireAnnuel;
	
	@Column(name = "nombre_formation_annuel")
	private int nombreFormationAnnuel;
	
	@Column(name = "nombre_client_annuel")
	private int nombreClienAnnuel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getChiffreAffaireAnnuel() {
		return chiffreAffaireAnnuel;
	}

	public void setChiffreAffaireAnnuel(double chiffreAffaireAnnuel) {
		this.chiffreAffaireAnnuel = chiffreAffaireAnnuel;
	}

	public int getNombreFormationAnnuel() {
		return nombreFormationAnnuel;
	}

	public void setNombreFormationAnnuel(int nombreFormationAnnuel) {
		this.nombreFormationAnnuel = nombreFormationAnnuel;
	}

	public int getNombreClienAnnuel() {
		return nombreClienAnnuel;
	}

	public void setNombreClienAnnuel(int nombreClienAnnuel) {
		this.nombreClienAnnuel = nombreClienAnnuel;
	}
	
	
}
