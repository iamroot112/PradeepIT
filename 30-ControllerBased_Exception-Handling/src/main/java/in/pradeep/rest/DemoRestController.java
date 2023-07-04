package in.pradeep.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pradeep.exception.exceptioninfo;

@RestController
public class DemoRestController {

	@GetMapping("/")
	public String DoAction() {
		String msg = "status in prograss";
		try {
			int a= 1/0;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		return msg;
	}
	
	public ResponseEntity<exceptioninfo> hEx( ArithmeticException ae){
		
		exceptioninfo ei = new exceptioninfo();
		ei.setMsg(ae.getMessage());
		ei.setCode("A001");
		return new ResponseEntity<>( ei,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}
