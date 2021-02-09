package formation.ib.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.ib.backend.entities.Entreprise;

public interface EntrepriseRepository  extends JpaRepository<Entreprise, Long>{
	
}
