package formation.ib.backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import formation.ib.backend.entities.Formateur;
import formation.ib.backend.repository.FormateurRepository;

@Service
public class FormateurService {
	
	@Autowired
	private FormateurRepository repository;

	public Formateur save(Formateur entity) {
		return repository.save(entity);
	}

	public List<Formateur> findAll() {
		return repository.findAll();
	}

	public Formateur findById(Long id) {
		return repository.findById(id)
				.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}

	
	
	

}
