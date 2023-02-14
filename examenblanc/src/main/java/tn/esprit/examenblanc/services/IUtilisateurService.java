package tn.esprit.examenblanc.services;

import tn.esprit.examenblanc.entities.Utilisateur;

public interface IUtilisateurService {
    public Utilisateur ajouterUtilisateur (Utilisateur utilisateur);
    public void affecterUtilisateurClasse (Integer idUtilisateur, Integer codeClasse);
}
