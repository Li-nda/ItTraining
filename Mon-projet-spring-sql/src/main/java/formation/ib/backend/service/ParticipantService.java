package formation.ib.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import formation.ib.backend.entities.Participant;
import formation.ib.backend.repository.ParticipantRepository;

@Service
/**
 * Cette classe interagit avec la base de données sur l'entité Participant
 * @author IB
 *
 */
public class ParticipantService {
	
	@Autowired
	private ParticipantRepository participantrepository;
	
	/**
	 * Cette méthode permet a création d'un nouveau Participant 
	 * @param participant
	 * @return
	 */
	public Participant save(Participant participant) {
		return participantrepository.save(participant);
	}
	
	/**
	 * Cette méthode permet de récupérer la liste des participants
	 * @return
	 */
	public List<Participant> findAll() {
		return participantrepository.findAll();
	}
 
	/**
	 * Cette méthode permet de récupérer un participant par son id
	 * @param id
	 * @return un participant
	 */
	public Participant findById(int id) {
		return participantrepository.findById(id)
				.orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND) );
	}
	
	/**
	 * Cette méthode permet de récupérer les participants correspondant à un nom
	 * @param nom
	 * @return une liste de participants
	 */
	public List<Participant> findByNom(String nom) {
		return participantrepository.findByNom(nom);
	}

	/**
	 * Cette méthode permet de récupérer les participants correspondant à un prénom
	 * @param prenom
	 * @return une liste de participants
	 */
	public List<Participant> findByPrenom(String prenom) {
		return participantrepository.findByPrenom(prenom);
	}
	
	/**
	 * Cette méthode permet de récupérer les participants correspondant à une date de naissance
	 * @param date
	 * @return une liste de participants
	 */
	public List<Participant> findByDateNaissance(String date) {
		return participantrepository.findByDateNaissance(date);
	}
	
	/**
	 * Cette méthode parmet de mettre à jour un participant
	 * @param participant
	 * @return une participant
	 */
	public Participant update(Participant participant) {
		return this.participantrepository.save(participant);
	}
	
	/**
	 * Cette méthode permet de supprimer un participant
	 * @param id
	 */
	public void deleteById(int id) {
		this.participantrepository.deleteById(id);
	}
}
