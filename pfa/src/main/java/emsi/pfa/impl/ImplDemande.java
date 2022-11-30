package emsi.pfa.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import emsi.pfa.model.Demande;
import emsi.pfa.repository.DemandeRepository;
import emsi.pfa.service.DemandeService;



@Service
public class ImplDemande  implements DemandeService{

	@Autowired
	DemandeRepository demandeRepository;
	@Override
	public Demande saveCompte(Demande demande,int id) {
		return demandeRepository.save(demande);
	}

	@Override
	public List<Demande> getAllDemande() {
		return demandeRepository.findAll();
	}

	@Override
	public Demande getDemandeById(int id) {
		return demandeRepository.getById(id);
	}

	@Override
	public Demande updateDemande(int id, Demande demande) {
		    Demande dm = demandeRepository.getById(id);
			dm.setDescription(demande.getDescription());
			dm.setEtat(demande.getEtat());
			dm.setTypeBesoin(demande.getTypeBesoin());
			dm.setDate(demande.getDate());
			dm.setUsers(demande.getUsers());
			demandeRepository.save(dm);
			return dm;
	}

	@Override
	public void deleteDemande(int id) {
		 demandeRepository.deleteById(id);
	}

}
