package formation.ib.backend.controllers;

import java.util.Date;
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

import formation.ib.backend.entities.Participant;
import formation.ib.backend.entities.Session;
import formation.ib.backend.service.ParticipantService;

@RestController

@CrossOrigin

@RequestMapping("participants")
/**
 * Cette classe permet de gérer les requêtes HTTP entre le client et le serveur
 * @author IB
 *
 */

public class ParticipantController {
	
	@Autowired
	private ParticipantService participantService;
	
	/**
	 * Cette méthode autorise une requête de type Post
	 * qui permettra la création d'un nouveau participant
	 * @param session
	 * @return une session
	 */
	@PostMapping("")
	public Participant save(@RequestBody Participant participant) {
		return participantService.save(participant);
	}
	
	/**
	 * Cette méthode autorise une requête de type Get 
	 * pour récupérer la liste des participants
	 * @return une liste de participants
	 */
	@GetMapping("")
	public List<Participant> findAll() {
		return participantService.findAll();
	}

	/**
	 * Cette méthode autorise une requête de type Get 
	 * pour récupérer un participant par son id
	 * @param id
	 * @return un participant
	 */
	@GetMapping("id/{id}")
	public Participant findById(@PathVariable int id) {
		return participantService.findById(id);
	}
	
	/**
	  * Cette méthode autorise une requête de type Get 
	  * pour récupérer une liste de participants par un nom
	  * @param nom
	  * @return une liste de participants
	  */
	@GetMapping("nom/{nom}")
	public List<Participant> findByNom(@PathVariable String nom) {
		return participantService.findByNom(nom);
	}
	
	/**
	  * Cette méthode autorise une requête de type Get 
	  * pour récupérer une liste de participants par un prénom
	 * @param prenom
	 * @return une liste de participants
	 */
	@GetMapping("prenom/{prenom}")
	public List<Participant> findByPrenom(@PathVariable String prenom) {
		return participantService.findByPrenom(prenom);
	}
	
	/**
	  * Cette méthode autorise une requête de type Get 
	  * pour récupérer une liste de participants par une date de naissance
	 * @param date
	 * @return une liste de participants
	 */
	@GetMapping("date/{date}")
	public List<Participant> findByDateNaissance(@PathVariable String date) {
		return participantService.findByDateNaissance(date);
	}
	
	/**
	 * Cette méthode autorise une requête de type Post
	 * pour mettre à jour un participant
	 * @param participant
	 * @return une participant
	 */
	@PostMapping("participant")
	public Participant update(@RequestBody Participant participant){
		return this.participantService.update(participant);
	}
	 /**
	 * Cette méthode autorise une requête de type Delete
	 * pour supprimer un participant
	  * @param id
	  */
	@DeleteMapping("id/{id}")
	public void deleteById(@PathVariable int id) {
		this.participantService.deleteById(id);
	}
	
}
