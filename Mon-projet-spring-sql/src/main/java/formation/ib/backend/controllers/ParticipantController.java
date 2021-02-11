package formation.ib.backend.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import formation.ib.backend.entities.Participant;
import formation.ib.backend.service.ParticipantService;

@RestController
@RequestMapping("participant")
public class ParticipantController {
	
	@Autowired
	private ParticipantService participantService;
	
	@PostMapping("")
	public Participant save(@RequestBody Participant participant) {
		return participantService.save(participant);
	}
	
	@GetMapping("")
	public List<Participant> findAll() {
		return participantService.findAll();
	}

	@GetMapping("id/{id}")
	public Participant findById(@PathVariable int id) {
		return participantService.findById(id);
	}
	
	@GetMapping("nom/{nom}")
	public List<Participant> findByNom(@PathVariable String nom) {
		return participantService.findByNom(nom);
	}
	
	@GetMapping("prenom/{prenom}")
	public List<Participant> findByPrenom(@PathVariable String prenom) {
		return participantService.findByPrenom(prenom);
	}
	
	@GetMapping("date/{date}")
	public List<Participant> findByDateNaissance(@PathVariable String date) {
		return participantService.findByDateNaissance(date);
	}
	
	
	
	
}
