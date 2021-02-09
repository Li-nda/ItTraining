package formation.ib.backend.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.ib.backend.entities.Session;

public interface SessionRepository extends JpaRepository<Session, Integer> {
	
	public List<Session> findByPrixHt(double prixHt);
	
	public List<Session> findByDateDebut(Date dateDebut);
	
	public List<Session> findByDateFin(Date dateFin);

}
