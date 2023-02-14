package tn.esprit.examenblanc.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "Utilisateur")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private int idUtilisateur;
    private String prenom;
    private String nom;
    private String password;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    Classe classe;


}
