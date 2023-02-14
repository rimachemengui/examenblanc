package tn.esprit.examenblanc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenblanc.entities.Classe;
import tn.esprit.examenblanc.entities.CoursClassroom;
import tn.esprit.examenblanc.entities.Utilisateur;
import tn.esprit.examenblanc.services.*;

@RestController
@RequestMapping("/user")
public class UserRestController {
    @Autowired
    IUtilisateurService utilisateurService;
@Autowired
    IClasseService classeService;
@Autowired

    ICoursClassroomService coursClassroomService;


    @PostMapping("/Ajouteruser")
    public Utilisateur ajouterUtilisateur(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.ajouterUtilisateur(utilisateur);

    }


    @PostMapping("/Ajouterclasse")
    public Classe ajouterClasse(@RequestBody Classe c) {
        return classeService.ajouterClasse(c);
    }


    @PostMapping("/Ajoutercoursclassroom/{codeClasse}")
    public CoursClassroom ajouterCoursClassroom(@RequestBody CoursClassroom cc, @PathVariable Integer codeClasse) {
        return coursClassroomService.ajouterCoursClassroom(cc,codeClasse);
    }
    @PostMapping("/affecterUtilisateurClasse/{idUtilisateur}/{codeClasse}")
    public void affecterUtilisateurClasse(@PathVariable("idUtilisateur") Integer idUtilisateur, @PathVariable("codeClasse") Integer codeClasse){
        utilisateurService.affecterUtilisateurClasse(idUtilisateur,codeClasse);
    }
}
