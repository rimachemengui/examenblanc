package tn.esprit.examenblanc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblanc.entities.Utilisateur;
@Repository

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
}
