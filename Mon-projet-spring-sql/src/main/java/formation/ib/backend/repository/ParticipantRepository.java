package formation.ib.backend.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.ib.backend.entities.Participant;

/**
 * Cette interface permet de se connecter à la base de données 
 * et donne accès nativement au principale requêtes SQL
 * @author IB
 *
 */
public interface ParticipantRepository extends JpaRepository<Participant, Integer> {
	
	/**
	 * Cette signature de méthode indique qu'elle permettra de récupérer 
	 * la liste des participants correspondant à un nom
	 * @param nom
	 * @return une liste de participants
	 */
	public List<Participant> findByNom(String nom);

	/**
	 * Cette signature de méthode indique qu'elle permettra de récupérer 
	 * la liste des participants correspondant à un prénom
	 * @param prenom
	 * @return une liste de participants
	 */
	public List<Participant> findByPrenom(String prenom);
	
	/**
	 * Cette signature de méthode indique qu'elle permettra de récupérer 
	 * la liste des participants correspondant à une date de naissance
	 * @param date
	 * @return une liste de participants
	 */
	public List<Participant> findByDateNaissance(String date);
}
