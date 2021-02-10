package formation.ib.backend.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import formation.ib.backend.entities.Entreprise;
import formation.ib.backend.repository.EntrepriseRepository;

@Service
/**
 * 
 * @author Mohammed TELIDJANE
 *
 */

public class EntrepriseService {
	
	@Autowired
	private EntrepriseRepository repository;

	/**
	 * Méthode qui sauvegarde la table entreprise dans la base de données
	 * @param entity
	 * @return
	 */
	public Entreprise save(Entreprise entity) {
		return repository.save(entity);
	}
	/**
	 * Méthode qui renvoi tous le contenu de la table Entreprise à partir de la base de données
	 * @return
	 */

	public List<Entreprise> findAll() {
		return repository.findAll();
		
	}

	/**
	 * Méthode qui renvoie les champs de la table Entreprise depuis la base de données à partir de leur Id de type Long
	 * @param id
	 * @return
	 */
	public Entreprise findById(Long id) {
		return repository.findById(id)
				.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	


}
