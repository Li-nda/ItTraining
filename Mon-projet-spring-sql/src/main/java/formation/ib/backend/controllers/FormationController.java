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

import formation.ib.backend.entities.Formation;
import formation.ib.backend.service.FormationService;

@RestController
@RequestMapping("formations")
@CrossOrigin

public class FormationController {
	
	@Autowired
	private FormationService service;

	

	@GetMapping
	public List<Formation> findAll() {
		System.out.println("1");
		return service.findAll();
	}
	
	@PostMapping
	
	public Formation save(@RequestBody Formation entity) {
		System.out.println("2");
		return service.save(entity);
		
		
	}
	
	@GetMapping("titre/{titre}")
	public List<Formation> findBytitre(@PathVariable String titre) {
		System.out.println("3");
		return service.findBytitre(titre);
	}
	
	@GetMapping("description/{description}")
	public List<Formation> findByDescription(@PathVariable String description) {
		System.out.println("4");
		return service.findByDescription(description);
	}
	
	@GetMapping({"id/{id}"})
	public Formation findById(@PathVariable Long id) {
		System.out.println("5");
		return service.findById(id);
	}
	
	
}
