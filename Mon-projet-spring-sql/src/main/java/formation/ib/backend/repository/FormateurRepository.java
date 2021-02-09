package formation.ib.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.ib.backend.entities.Formateur;

public interface FormateurRepository extends JpaRepository<Formateur, Long> {

}
