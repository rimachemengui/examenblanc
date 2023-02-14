package tn.esprit.examenblanc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblanc.entities.Classe;

@Repository

public interface ClasseRepository extends JpaRepository<Classe, Integer> {
}
