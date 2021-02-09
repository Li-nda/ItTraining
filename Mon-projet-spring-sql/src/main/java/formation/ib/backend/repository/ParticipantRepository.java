package formation.ib.backend.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.ib.backend.entities.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Integer> {
	
	public List<Participant> findByNom(String nom);

	public List<Participant> findByPrenom(String prenom);
	
	public List<Participant> findByDateNaissance(Date date);
}
