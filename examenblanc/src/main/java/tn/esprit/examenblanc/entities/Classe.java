package tn.esprit.examenblanc.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Classe")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Classe  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

   private int codeClasse;
    private  String titre;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "classe")
    private Set<CoursClassroom> coursClassroom;
}
