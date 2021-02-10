package formation.ib.backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import formation.ib.backend.entities.Formateur;
import formation.ib.backend.repository.FormateurRepository;

@Service
/**
 * 
 * @author IB
 *
 */
public class FormateurService {
	
	@Autowired
	private FormateurRepository repository;
	
	/**
	 * Méthode qui sauvegarde la table Formateur dans la base de données
	 * @param entity
	 * @return
	 */

	public Formateur save(Formateur entity) {
		return repository.save(entity);
	}
	
	/**
	 * Méthode qui renvoi tous le contenu de la table Formateur à partir de la base de données
	 * @return
	 */

	public List<Formateur> findAll() {
		return repository.findAll();
	}
	
	/**
	 * Méthode qui renvoie les champs de la table Formateur depuis la base de données à partir de leur Id de type Long
	 * @param id
	 * @return
	 */

	public Formateur findById(Long id) {
		return repository.findById(id)
				.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}

	
	
	

}
