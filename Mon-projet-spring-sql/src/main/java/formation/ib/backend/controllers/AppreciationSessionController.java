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

import formation.ib.backend.entities.AppreciationSession;
import formation.ib.backend.service.AppreciationSessionService;

@RestController
@RequestMapping("appreciationsession")
public class AppreciationSessionController {
	
	@Autowired
	private AppreciationSessionService appreciationSessionService;
	
	@PostMapping("")
	public AppreciationSession save(@RequestBody AppreciationSession appreciationSession) {
		return appreciationSessionService.save(appreciationSession);
	}
	
	@GetMapping("")
	public List<AppreciationSession> findAll() {
		return appreciationSessionService.findAll();
	}
	
	@GetMapping("id/{id}")
	public AppreciationSession findById(@PathVariable int id) {
		return appreciationSessionService.findById(id);
	}
	
	@GetMapping("noteAccueil/{noteAccueil}")
	public List<AppreciationSession> findByQualiteAccueil(@PathVariable int noteAccueil) {
		return appreciationSessionService.findByQualiteAccueil(noteAccueil);
	}
	
	@GetMapping("noteEnvironnement/{noteEnvironnement}")
	public List<AppreciationSession> findByQualiteEnvironnement(@PathVariable int noteEnvironnement) {
		return appreciationSessionService.findByQualiteEnvironnement(noteEnvironnement);
	}
	
	@GetMapping("noteSatisfaction/{noteSatisfaction}")
	public List<AppreciationSession> findBySatisfactionStagiaire(@PathVariable int noteSatisfaction) {
		return appreciationSessionService.findBySatisfactionStagiaire(noteSatisfaction);
	}
	
	@GetMapping("recommandeFormation/{recommandeFormation}")
	public List<AppreciationSession> findByRecommandeFormation(@PathVariable Boolean recommandeFormation) {
		return appreciationSessionService.findByRecommandeFormation(recommandeFormation);
	}
	
	@GetMapping("projetFormation/{projetFormation}")
	public List<AppreciationSession> findByProjetFormation(@PathVariable Boolean projetFormation) {
		return appreciationSessionService.findByProjetFormation(projetFormation);
	}
	
	@GetMapping("date/{date}")
	public List<AppreciationSession> findByDate(@PathVariable String date) {
		return appreciationSessionService.findByDate(date);
	}
	
	
	
	

}
