package in.pradeep.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.pradeep.Entity.Student;
import in.pradeep.Service.StudentService;

@RestController
public class Studentrestcontroller {
	@Autowired
	private StudentService service;

	@PostMapping("/student")
	public ResponseEntity<String> addStudent(@RequestBody Student student) {
		String m = service.upsertStudent(student);
		return new ResponseEntity<>(m, HttpStatus.CREATED);

	}

	@GetMapping("/students")
	public ResponseEntity<List<Student>> getStudent() {
		List<Student> allstu = service.getAllStudent();
		return new ResponseEntity<>(allstu, HttpStatus.OK);

	}

	@PutMapping("/student")
	public ResponseEntity<String> updateStudent(@RequestBody Student student) {
		String m1 = service.upsertStudent(student);
		return new ResponseEntity<>(m1, HttpStatus.OK);
	}

	@DeleteMapping("/student/{Sid}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer Sid) {
		String m2 = service.DeleateStudent(Sid);
		return new ResponseEntity<>(m2, HttpStatus.OK);
	}
}
