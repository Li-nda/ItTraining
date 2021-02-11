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

import formation.ib.backend.entities.Session;
import formation.ib.backend.service.SessionService;

@RestController
@RequestMapping("session")
public class SessionController {
	
	@Autowired
	private SessionService sessionService;
	
	@PostMapping("")
	public Session save(@RequestBody Session session) {
		return sessionService.save(session);
	}
	
	@GetMapping("")
	public List<Session> findAll() {
		return sessionService.findAll();
	}
	
	@GetMapping("id/{id}")
	public Session findById(@PathVariable int id) {
		return sessionService.findById(id);
	}
	
	@GetMapping("prix/{prix}")
	public List<Session> findByPrixHt(@PathVariable double prix) {
		return sessionService.findByPrixHt(prix);
	}
	
	@GetMapping("dateDebut/{dateDebut}")
	public List<Session> findByDateDebut(@PathVariable String dateDebut) {
		return sessionService.findByDateDebut(dateDebut);
	}
	
	@GetMapping("dateFin/{dateFin}")
	public List<Session> findByDateFin(@PathVariable String dateFin) {
		return sessionService.findByDateFin(dateFin);
	}

}
