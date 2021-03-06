package formation.ib.backend.controllers;

import java.util.List;

import javax.persistence.PostUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import formation.ib.backend.entities.Session;
import formation.ib.backend.service.SessionService;

@RestController
@RequestMapping("sessions")
@CrossOrigin
/**
 * Cette classe permet de gérer les requêtes HTTP entre le client et le serveur
 * @author IB
 *
 */
public class SessionController {
	
	@Autowired
	private SessionService sessionService;
	
	/**
	 * Cette méthode autorise une requête de type Post
	 * qui permettra la création d'une nouvelle session
	 * @param session
	 * @return une session
	 */
	@PostMapping("")
	public Session save(@RequestBody Session session) {
		return sessionService.save(session);
	}
	
	/**
	 * Cette méthode autorise une requête de type Get 
	 * pour récupérer la liste des sessions
	 * @return une liste de sessions
	 */
	@GetMapping("")
	public List<Session> findAll() {
		return sessionService.findAll();
	}
	
	/**
	 * Cette méthode autorise une requête de type Get 
	 * pour récupérer une session par son id
	 * @param id
	 * @return une session
	 */
	@GetMapping("id/{id}")
	public Session findById(@PathVariable int id) {
		return sessionService.findById(id);
	}
	 /**
	  * Cette méthode autorise une requête de type Get 
	  * pour récupérer une liste de sessions par un prix HT
	  * @param prix
	  * @return une liste de sessions
	  */
	@GetMapping("prix/{prix}")
	public List<Session> findByPrixHt(@PathVariable double prix) {
		return sessionService.findByPrixHt(prix);
	}
	
	/**
	 * Cette méthode autorise une requête de type Get 
	 * pour récupérer une liste de sessions par une date de début
	 * @param dateDebut
	 * @return une liste de sessions
	 */
	@GetMapping("dateDebut/{dateDebut}")
	public List<Session> findByDateDebut(@PathVariable String dateDebut) {
		return sessionService.findByDateDebut(dateDebut);
	}
	
	/**
	 * Cette méthode autorise une requête de type Get 
	 * pour récupérer une liste de sessions par une date de fin
	 * @param dateFin
	 * @return une liste de sessions
	 */
	@GetMapping("dateFin/{dateFin}")
	public List<Session> findByDateFin(@PathVariable String dateFin) {
		return sessionService.findByDateFin(dateFin);
	}
	
	/**
	 * Cette méthode autorise une requête de type Post
	 * pour mettre à jour une session
	 * @param session
	 * @return une session
	 */
	@PostMapping("session")
	public Session updateBySession(@RequestBody Session session) {
		return this.sessionService.update(session);
	}
	
	/**
	 * Cette méthode autorise une requête de type Delete
	 * pour supprimer une session
	 * @param id
	 */
	@DeleteMapping("id/{id}")
	public void deleteById(@PathVariable int id) {
		this.sessionService.deleteById(id);
	}

}
