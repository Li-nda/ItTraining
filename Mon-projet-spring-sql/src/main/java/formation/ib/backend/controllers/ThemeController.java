package formation.ib.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import formation.ib.backend.entities.Theme;
import formation.ib.backend.service.ThemeService;

@RestController
@RequestMapping("themes")
@CrossOrigin



public class ThemeController {
	@Autowired
	private ThemeService service;
	
	
	@PostMapping("")
	public Theme save(@RequestBody Theme entity) {
		return service.save(entity);
	}
	
	@GetMapping
	public List<Theme> findAll() {
		return service.findAll();
	}
	
	@GetMapping({"id/{id}"})
	public Theme findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@DeleteMapping("id/{id}")
	public void deleteById(@PathVariable Long id) {
		service.deleteById(id);
	}
	
	
	@PutMapping("id/{id}")
	public Theme update(@PathVariable Long id, @RequestBody Theme theme) {
		return service.update(id,theme);
		
		
	}
	
		
}
