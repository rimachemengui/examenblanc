package tn.esprit.examenblanc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.examenblanc.entities.Utilisateur;
import tn.esprit.examenblanc.entities.Classe;
import tn.esprit.examenblanc.repositories.ClasseRepository;
import tn.esprit.examenblanc.repositories.UtilisateurRepository;

import javax.persistence.Enumerated;

@Service
public class UtilisateurService implements IUtilisateurService{
    @Autowired
  public UtilisateurRepository utilisateurRepository;
    @Autowired
    public ClasseRepository classeRepository;
    @Override
    public Utilisateur ajouterUtilisateur(Utilisateur utilisateur) {
        utilisateurRepository.save(utilisateur);
        return utilisateur;
    }

    @Override
    public void affecterUtilisateurClasse(Integer idUtilisateur, Integer codeClasse) {
        Utilisateur u = utilisateurRepository.findById(idUtilisateur).orElse(null);
        Classe c = classeRepository.findById(codeClasse).orElse(null);
        u.setClasse(c);

    }
}
