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

import formation.ib.backend.entities.FormulaireContact;
import formation.ib.backend.service.FormulaireContactService;

@RestController
@RequestMapping("formulaire")
@CrossOrigin
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
	
	@GetMapping("id/{id}")
	public FormulaireContact findById(@PathVariable int id) {
		return formulaireContactService.findById(id);
	}
	
	@GetMapping("nom/{nom}")
	public List<FormulaireContact> findByNom(@PathVariable String nom) {
		return formulaireContactService.findByNom(nom);
	}
	
	@GetMapping("prenom/{prenom}")
	public List<FormulaireContact> findByPrenom(@PathVariable String prenom) {
		return formulaireContactService.findByPrenom(prenom);
	}
	
	@GetMapping("email/{email}")
	public List<FormulaireContact> findBtEmail(@PathVariable String email) {
		return formulaireContactService.findByEmail(email);
	}
	
	@GetMapping("telephone/{telephone}")
	public List<FormulaireContact> findByTelephone(@PathVariable String telephone) {
		return formulaireContactService.findByTelephone(telephone);
	}
	
	@GetMapping("message/{message}")
	public List<FormulaireContact> findByMessage(@PathVariable String message) {
		return formulaireContactService.findByMessage(message);
	}

}
