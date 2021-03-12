package formation.ib.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import formation.ib.backend.entities.Session;
import formation.ib.backend.repository.SessionRepository;

@Service
/**
 * Cette classe interagit avec la base de données sur l'entité Session
 * @author IB
 *
 */
public class SessionService {
	
	@Autowired
	private SessionRepository sessionRepository;
	
	/**
	 * Cette méthode permet a création d'une nouvelle Session
	 * @param session
	 * @return une nouvelle Session
	 */
	public Session save(Session session) {
		return sessionRepository.save(session);
	}
	
	/**
	 * Cette méthode permet de récupérer la liste des sessions
	 * @return la liste de sessions
	 */
	public List<Session> findAll() {
		return sessionRepository.findAll();
	}
	
	/**
	 * Cette méthode permet de récupérer une session par son id
	 * @param id
	 * @return une session
	 */
	public Session findById(int id) {
		return sessionRepository.findById(id)
				.orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND) );
	}
	
	/**
	 * Cette méthode permet de récupérer les sessions correspondant à un prix
	 * @param prixHt
	 * @return une liste de sessions
	 */
	public List<Session> findByPrixHt(double prixHt) {
		return sessionRepository.findByPrixHt(prixHt);
	}
	
	/**
	 * Cette méthode permet de récupérer les sessions correspondant à une date de début
	 * @param dateDebut
	 * @return une liste de sessions
	 */
	public List<Session> findByDateDebut(String dateDebut) {
		return sessionRepository.findByDateDebut(dateDebut);
	}
	
	/**
	 * Cette méthode permet de récupérer les sessions correspondant à une date de fin
	 * @param dateFin
	 * @return une liste de sessions
	 */
	public List<Session> findByDateFin(String dateFin) {
		return sessionRepository.findByDateFin(dateFin);
	}
	
	/**
	 * Cette méthode permet de mettre à jour une session
	 * @param session
	 * @return une session
	 */
	public Session update(Session session) {
		return this.sessionRepository.save(session);
	}
	
	/**
	 * Cette méthode permet de supprimer une session
	 * @param id
	 */
	public void deleteById(int id) {
		this.sessionRepository.deleteById(id);
	}

}
