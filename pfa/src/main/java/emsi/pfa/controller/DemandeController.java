package emsi.pfa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import emsi.pfa.model.Demande;
import emsi.pfa.model.User;
import emsi.pfa.repository.UserRepository;
import emsi.pfa.service.DemandeService;



@RestController
@RequestMapping("/demande")
public class DemandeController {
	@Autowired
	DemandeService demandeService;
	
	@Autowired
	UserRepository repository;
	
	@PostMapping("/add/{id}")
	public void ajouter(@RequestBody Demande d,@PathVariable("id") int id) {
		for(User utilisateur: repository.findByIdUser(id)) {
			if(utilisateur.getId()==id) {
				User r = repository.findById(id).get();
				d.setUsers(r);
				demandeService.saveCompte(d, utilisateur.getId());
			}else {
				System.out.println("ereur d'ajout");
			}
			
		}
	}
	
	@GetMapping("/all")
	public List<Demande> findAll() {
		return demandeService.getAllDemande();
	}
	
	@GetMapping("/get/{id}")
	public Demande getid(@PathVariable(name = "id", required = true) int id) {
		return demandeService.getDemandeById(id);
	}
	
	@GetMapping("/update/{id}")
	public void update(@PathVariable(name = "id", required = true) int id) {
		return ;
		//return demandeService.updateDemande(id,);
	}

	@DeleteMapping("/deleteDemande/{id}")
	private void deleteUser(@PathVariable("id") int id) {
		 demandeService.deleteDemande(id);
	}

}
