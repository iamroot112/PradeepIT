package in.pradeep.restcontroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.pradeep.Binding.Student;

@RestController
public class StudentRest {
	@GetMapping(value = "/student", produces = { /*"application/xml",*/ "application/json" })
	
	public ResponseEntity<Student> getSdata() {
		Student student = new Student();
		student.setSid(11);
		student.setSname("pradeep");
		return new ResponseEntity<>(student, HttpStatus.OK);
	}
	@GetMapping(value = "/students", produces = { "application/xml", "application/json" })
public ResponseEntity<List<Student>> getSdatas(){
	Student s1=new Student(1,"ram");
	Student s2=new Student(2,"sita");
 List<Student> ssss=Arrays.asList(s1,s2);
 return new ResponseEntity<>(ssss,HttpStatus.OK);
}
	
	@PostMapping(value="/student",consumes= {"application/xml", "application/json" })
	public ResponseEntity<String> PostSdata(@RequestBody Student student){
		System.out.println(student);
		String suc="succesfully done"; 
		return new ResponseEntity<String>(suc,HttpStatus.CREATED);
		  
	}
}
