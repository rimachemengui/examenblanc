package tn.esprit.examenblanc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.examenblanc.entities.Classe;
import tn.esprit.examenblanc.repositories.ClasseRepository;

@Service
public class ClasseService implements IClasseService{
    @Autowired
    public ClasseRepository classeRepository;
    @Override
    public Classe ajouterClasse(Classe c) {
        classeRepository.save(c);
        return c;
    }
}
