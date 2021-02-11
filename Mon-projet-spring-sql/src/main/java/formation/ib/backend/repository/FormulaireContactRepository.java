package formation.ib.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.ib.backend.entities.FormulaireContact;

public interface FormulaireContactRepository extends JpaRepository<FormulaireContact, Integer>{
	
	public List<FormulaireContact> findByNom(String nom);
	
	public List<FormulaireContact> findByPrenom(String prenom);
	
	public List<FormulaireContact> findByEmail(String email);
	
	public List<FormulaireContact> findByTelephone(String telephone);
	
	public List<FormulaireContact> findByMessage(String message);

}
