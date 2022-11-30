package emsi.pfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import emsi.pfa.model.Demande;


@Repository
public interface DemandeRepository  extends JpaRepository<Demande , Integer> {

}
