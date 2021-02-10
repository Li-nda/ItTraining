package formation.ib.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import formation.ib.backend.entities.Theme;
import formation.ib.backend.repository.ThemeRepository;

@Service

/**
 * 
 * @author IB
 *
 */
public class ThemeService {
	
	@Autowired
	private ThemeRepository repository;

	/**
	 * Méthode qui sauvegarde la table Theme dans la base de données
	 * @param entity
	 * @return
	 */
	public Theme save(Theme entity) {
		return repository.save(entity);
	}
	
	/**
	 * Méthode qui renvoi tous le contenu de la table Theme à partir de la base de données
	 * @return
	 */

	public List<Theme> findAll() {
		return repository.findAll();
	}
	
	/**
	 * Méthode qui renvoie les champs de la table Theme depuis la base de données à partir de leur Id de type Long
	 * @param id
	 * @return
	 */
	public Theme findById(Long id) {
		return repository.findById(id)
				.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	/**
	 * Méthode qui supprime les champs de la table Theme de la base de données à partir de leur Id de type Long
	 * @param id
	 * @return
	 */
	
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	/**
	 * Méthode qui mis à jour les champs de la table Theme depuis la base de données à partir de leur Id de type Long 
	 * et les nouveaux champs
	 * @param id
	 * @param theme1
	 * @return
	 */
	public Theme update(Long id, Theme theme1) {
		
		Theme theme = repository.findById(id)
				.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
		theme.setNom(theme1.getNom());
		return repository.save(theme) ;
	}

}
