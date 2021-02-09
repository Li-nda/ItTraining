package formation.ib.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import formation.ib.backend.entities.FormulaireContact;
import formation.ib.backend.repository.FormulaireContactRepository;

@Service
public class FormulaireContactService {
	
	@Autowired
	private FormulaireContactRepository formulaireContactRepository;
	
	public FormulaireContact save(FormulaireContact formulaireContact) {
		return formulaireContactRepository.save(formulaireContact);
	}
	
	public List<FormulaireContact> findAll() {
		return formulaireContactRepository.findAll();
	}
	
	public FormulaireContact findById(int id) {
		return formulaireContactRepository.findById(id)
				.orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND) );
	}
	
	
	public List<FormulaireContact> findByNom(String nom) {
		return formulaireContactRepository.findByNom(nom);
	}
	
	public List<FormulaireContact> findByPrenom(String prenom) {
		return formulaireContactRepository.findByNom(prenom);
	}
	
	public List<FormulaireContact> findBtEmail(String email) {
		return formulaireContactRepository.findByEmail(email);
	}
	
	public List<FormulaireContact> findByTelephone(String telephone) {
		return formulaireContactRepository.findByTelephone(telephone);
	}

}
