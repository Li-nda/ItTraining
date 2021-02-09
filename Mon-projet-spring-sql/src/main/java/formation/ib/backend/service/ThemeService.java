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

public class ThemeService {
	
	@Autowired
	private ThemeRepository repository;

	public Theme save(Theme entity) {
		return repository.save(entity);
	}

	public List<Theme> findAll() {
		return repository.findAll();
	}

	public Theme findById(Long id) {
		return repository.findById(id)
				.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	
	
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	
	public Theme update(Long id, Theme theme1) {
		
		Theme theme = repository.findById(id)
				.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
		theme.setNom(theme1.getNom());
		return repository.save(theme) ;
	}

}
