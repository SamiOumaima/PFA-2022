package emsi.pfa.service;

import java.util.List;

import emsi.pfa.model.Demande;

public interface DemandeService {
	Demande saveCompte(Demande demande, int i);
	List<Demande> getAllDemande();
	Demande getDemandeById(int id);
	Demande updateDemande(int id, Demande demande);
	void deleteDemande(int id);


}
