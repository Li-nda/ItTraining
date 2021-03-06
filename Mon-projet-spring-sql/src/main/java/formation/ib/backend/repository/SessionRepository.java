package formation.ib.backend.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.ib.backend.entities.Session;
/**
 * Cette interface permet de se connecter à la base de données 
 * et donne accès nativement au principale requêtes SQL
 * @author IB
 *
 */
public interface SessionRepository extends JpaRepository<Session, Integer> {
	
	/**
	 * Cette signature de méthode indique qu'elle permettra de récupérer 
	 * la liste des sessions correspondant à un prix HT
	 * @param prixHt
	 * @return une liste de sessions
	 */
	public List<Session> findByPrixHt(double prixHt);
	
	/**
	 * Cette signature de méthode indique qu'elle permettra de récupérer 
	 * la liste des sessions correspondant à une date de début
	 * @param dateDebut
	 * @return une liste de sessions
	 */
	public List<Session> findByDateDebut(String dateDebut);
	
	/**
	 * Cette signature de méthode indique qu'elle permettra de récupérer 
	 * la liste des sessions correspondant à une date de fin
	 * @param dateFin
	 * @return une liste de sessions
	 */
	public List<Session> findByDateFin(String dateFin);
	

}
