package tn.esprit.examenblanc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.examenblanc.entities.Classe;
import tn.esprit.examenblanc.entities.CoursClassroom;
import tn.esprit.examenblanc.repositories.ClasseRepository;
import tn.esprit.examenblanc.repositories.CoursClassroomRepository;

@Service

public class CoursClassroomService implements ICoursClassroomService{
    @Autowired
    public CoursClassroomRepository coursClassroomRepository;
    @Autowired
    public  ClasseRepository classeRepository;

    @Override
    public CoursClassroom ajouterCoursClassroom(CoursClassroom cc, Integer codeClasse) {
        Classe classe = classeRepository.findById(codeClasse).orElse(null);
         cc.setClasse(classe);
         coursClassroomRepository.save(cc);
         return cc;

    }
}
