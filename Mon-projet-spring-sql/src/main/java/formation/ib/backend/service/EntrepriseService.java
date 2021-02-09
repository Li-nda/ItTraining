package formation.ib.backend.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import formation.ib.backend.entities.Entreprise;
import formation.ib.backend.repository.EntrepriseRepository;

@Service

public class EntrepriseService {
	
	@Autowired
	private EntrepriseRepository repository;

	public Entreprise save(Entreprise entity) {
		return repository.save(entity);
	}

	public List<Entreprise> findAll() {
		return repository.findAll();
		
	}

	public Entreprise findById(Long id) {
		return repository.findById(id)
				.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	


}
