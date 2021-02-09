package formation.ib.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import formation.ib.backend.entities.FormulaireContact;
import formation.ib.backend.service.FormulaireContactService;

@RestController
@RequestMapping("formulaire")
public class FormulaireContactController {
	
	@Autowired
	private FormulaireContactService formulaireContactService ;
	
	@PostMapping("")
	public FormulaireContact save(@RequestBody FormulaireContact formulaireContact) {
		return formulaireContactService.save(formulaireContact);
	}
	
	@GetMapping("")
	public List<FormulaireContact> findAll() {
		return formulaireContactService.findAll();
	}
	
	@GetMapping("{id}")
	public FormulaireContact findById(@PathVariable int id) {
		return formulaireContactService.findById(id);
	}
	
	@GetMapping("{nom}")
	public List<FormulaireContact> findByNom(@PathVariable String nom) {
		return formulaireContactService.findByNom(nom);
	}
	
	@GetMapping("{prenom}")
	public List<FormulaireContact> findByPrenom(@PathVariable String prenom) {
		return formulaireContactService.findByNom(prenom);
	}
	
	@GetMapping("{email}")
	public List<FormulaireContact> findBtEmail(String email) {
		return formulaireContactService.findBtEmail(email);
	}
	
	@GetMapping("{telephone}")
	public List<FormulaireContact> findByTelephone(String telephone) {
		return formulaireContactService.findByTelephone(telephone);
	}

}
