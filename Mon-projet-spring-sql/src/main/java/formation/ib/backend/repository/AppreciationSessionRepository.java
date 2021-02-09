package formation.ib.backend.repository;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.ib.backend.entities.AppreciationSession;

public interface AppreciationSessionRepository extends JpaRepository<AppreciationSession, Integer> {

	public List<AppreciationSession> findByQualiteAccueil(int qualiteAccueil);
	
	public List<AppreciationSession> findByQualiteEnvironnement(int qualiteEnvironnement);
	
	public List<AppreciationSession> findBySatisfactionStagiaire(int satisfactionStagiaire);
	
	public List<AppreciationSession> findByRecommandeFormation(Boolean recommandeFormation);
	
	public List<AppreciationSession> findByProjetFormation(Boolean projetFormation);
	
	public List<AppreciationSession> findByDate(Date date);
}
