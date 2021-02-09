package formation.ib.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import formation.ib.backend.entities.Entreprise;
import formation.ib.backend.service.EntrepriseService;

@RestController
@RequestMapping("entreprise")
@CrossOrigin

public class EntrepriseController {
	
	@Autowired
	private EntrepriseService service;
	
	@PostMapping("")
	public Entreprise save(@RequestBody Entreprise entity) {
		return service.save(entity);
	}
	@GetMapping("")
	public List<Entreprise> findAll() {
		return service.findAll();
	}

	@GetMapping({"id/{id}"})
	public Entreprise findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	
	
	

}
