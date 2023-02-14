package tn.esprit.examenblanc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblanc.entities.CoursClassroom;
@Repository

public interface CoursClassroomRepository extends JpaRepository<CoursClassroom, Integer> {
}
