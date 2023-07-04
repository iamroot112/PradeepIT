package in.pradeep.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pradeep.Entity.Student;
import in.pradeep.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepo repo;

//=======================insert and update ========================

	public StudentServiceImpl(StudentRepo repo) {
		this.repo = repo;
	}

	@Override
	public String upsertStudent(Student student) {
		repo.save(student);
		if (student.getSid() == null) {

			return "inserted";
		} else
			return "updated";

	}

//getdata
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub

		return repo.findAll();
	}

	@Override
	public String DeleateStudent(Integer Sid) {
		repo.deleteById(Sid);
		String msg = Sid + "deleted";
		// TODO Auto-generated method stub
		return msg;
	}

}
