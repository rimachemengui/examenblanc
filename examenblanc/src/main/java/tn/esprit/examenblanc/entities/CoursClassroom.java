package tn.esprit.examenblanc.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.awt.*;
import java.io.Serializable;
@Entity
@Table(name = "CoursClassroom")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class CoursClassroom implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idCours;
    @Enumerated(EnumType.STRING)
   private   Specialite specialite;
    private String nom;
    private int nbHeures;
    private boolean archive;
    @JsonIgnore
    @ManyToOne
    Classe classe;
}
