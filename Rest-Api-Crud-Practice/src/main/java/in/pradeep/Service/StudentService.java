package in.pradeep.Service;

import java.util.List;

import in.pradeep.Entity.Student;

public interface StudentService {

	public String upsertStudent(Student student);

	public List<Student> getAllStudent();

	// public String UpdateStudent(Student student);
	public String DeleateStudent(Integer Sid);

}
