package formation.ib.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import formation.ib.backend.entities.Formation;
import formation.ib.backend.repository.FormationRepository;

@Service

/**
 * 
 * @author IB
 *
 */

public class FormationService {
	@Autowired
	private FormationRepository repository;

	/**
	 * Méthode qui sauvegarde la table Formation dans la base de données
	 * @param entity
	 * @return
	 */
	public Formation save(Formation entity) {
		System.out.println("6");
		return repository.save(entity);
		
		
	}
	
	/**
	 * Méthode qui renvoi tous le contenu de la table Formation à partir de la base de données
	 * @return
	 */
	public List<Formation> findAll() {
		System.out.println("7");
		return repository.findAll();
	}
	
	/**
	 * 
	 * @param titre
	 * @return
	 */
	public List<Formation> findBytitre(String titre) {
		System.out.println("8");
		return repository.findBytitre(titre);
	}
	
	/**
	 * 
	 * @param description
	 * @return
	 */

	public List<Formation> findByDescription(String description) {
		System.out.println("9");
		return repository.findByDescription(description);
		
	}
	
	/**
	 * Méthode qui renvoie les champs de la table Formation depuis la base de données à partir de leur Id de type Long
	 * @param id
	 * @return
	 */

	public Formation findById(Long id) {
		System.out.println("10");
		return repository.findById(id)
				.orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
		

	}
	
	
	
}
