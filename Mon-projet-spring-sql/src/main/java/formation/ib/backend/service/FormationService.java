package formation.ib.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import formation.ib.backend.entities.Formation;
import formation.ib.backend.repository.FormationRepository;

@Service

public class FormationService {
	@Autowired
	private FormationRepository repository;

	
	public Formation save(Formation entity) {
		System.out.println("6");
		return repository.save(entity);
		
		
	}
	
	public List<Formation> findAll() {
		System.out.println("7");
		return repository.findAll();
	}
	
	public List<Formation> findBytitre(String titre) {
		System.out.println("8");
		return repository.findBytitre(titre);
	}

	public List<Formation> findByDescription(String description) {
		System.out.println("9");
		return repository.findByDescription(description);
		
	}

	public Formation findById(Long id) {
		System.out.println("10");
		return repository.findById(id)
				.orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
		

	}
	
	
	
}
