package formation.ib.backend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.ib.backend.entities.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long>{
	
	public List<Formation> findBytitre(String titre);
	public List<Formation> findByDescription(String description);
	
	
	
}


