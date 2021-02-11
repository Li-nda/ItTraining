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
public class ParticipantService {
	
	@Autowired
	private ParticipantRepository participantrepository;
	
	public Participant save(Participant participant) {
		return participantrepository.save(participant);
	}
	
	public List<Participant> findAll() {
		return participantrepository.findAll();
	}
 
	public Participant findById(int id) {
		return participantrepository.findById(id)
				.orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND) );
	}
	
	public List<Participant> findByNom(String nom) {
		return participantrepository.findByNom(nom);
	}

	public List<Participant> findByPrenom(String prenom) {
		return participantrepository.findByPrenom(prenom);
	}
	
	public List<Participant> findByDateNaissance(Date date) {
		return participantrepository.findByDateNaissance(date);
	}
}
