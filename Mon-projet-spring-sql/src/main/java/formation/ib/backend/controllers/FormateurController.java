package formation.ib.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import formation.ib.backend.entities.Formateur;
import formation.ib.backend.service.FormateurService;

@RestController
@RequestMapping("formateurs")
@CrossOrigin

public class FormateurController {
	
	@Autowired
	private FormateurService service;

	
	@PostMapping
	public Formateur save(@RequestBody Formateur entity) {
		return service.save(entity);
	}
	
	@GetMapping
	public List<Formateur> findAll() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Formateur findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@DeleteMapping("id/{id}")
	public void deleteById(@PathVariable Long id) {
		service.deleteById(id);
	}
	
//	@DeleteMapping("id/{id}")
//	public void deleteById(@PathVariable Long id) {
//		service.deleteById(id);
//	}

}
