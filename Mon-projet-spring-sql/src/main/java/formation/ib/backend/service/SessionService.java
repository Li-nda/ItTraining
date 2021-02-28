package formation.ib.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import formation.ib.backend.entities.Session;
import formation.ib.backend.repository.SessionRepository;

@Service
public class SessionService {
	
	@Autowired
	private SessionRepository sessionRepository;
	
	public Session save(Session session) {
		return sessionRepository.save(session);
	}
	
	public List<Session> findAll() {
		return sessionRepository.findAll();
	}
	
	public Session findById(int id) {
		return sessionRepository.findById(id)
				.orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND) );
	}
	
	public List<Session> findByPrixHt(double prixHt) {
		return sessionRepository.findByPrixHt(prixHt);
	}
	
	public List<Session> findByDateDebut(String dateDebut) {
		return sessionRepository.findByDateDebut(dateDebut);
	}
	
	public List<Session> findByDateFin(String dateFin) {
		return sessionRepository.findByDateFin(dateFin);
	}
	
	
	
	

}
