package formation.ib.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import formation.ib.backend.entities.AppreciationSession;
import formation.ib.backend.repository.AppreciationSessionRepository;

@Service
public class AppreciationSessionService {
	
	@Autowired
	private AppreciationSessionRepository appreciationSessionRepository;
	
	public AppreciationSession save(AppreciationSession appreciationSession) {
		return appreciationSessionRepository.save(appreciationSession);
	}
	
	public List<AppreciationSession> findAll() {
		return appreciationSessionRepository.findAll();
	}
	
	public AppreciationSession findById(int id) {
		return appreciationSessionRepository.findById(id)
				.orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND) );
	}
	
	public List<AppreciationSession> findByQualiteAccueil(int qualiteAccueil) {
		return appreciationSessionRepository.findByQualiteAccueil(qualiteAccueil);
	}
	
	public List<AppreciationSession> findByQualiteEnvironnement(int qualiteEnvironnement) {
		return appreciationSessionRepository.findByQualiteEnvironnement(qualiteEnvironnement);
	}
	
	public List<AppreciationSession> findBySatisfactionStagiaire(int satisfactionStagiaire) {
		return appreciationSessionRepository.findBySatisfactionStagiaire(satisfactionStagiaire);
	}
	
	public List<AppreciationSession> findByRecommandeFormation(Boolean recommandeFormation) {
		return appreciationSessionRepository.findByRecommandeFormation(recommandeFormation);
	}
	
	public List<AppreciationSession> findByProjetFormation(Boolean projetFormation) {
		return appreciationSessionRepository.findByProjetFormation(projetFormation);
	}
	
	public List<AppreciationSession> findByDate(Date date) {
		return appreciationSessionRepository.findByDate(date);
	}

}
