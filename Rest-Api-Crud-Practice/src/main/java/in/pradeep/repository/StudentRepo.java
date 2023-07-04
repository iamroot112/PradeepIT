package in.pradeep.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import in.pradeep.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Serializable> {

}
