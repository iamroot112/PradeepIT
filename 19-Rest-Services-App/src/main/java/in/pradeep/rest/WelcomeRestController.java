package in.pradeep.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomemsg(@RequestParam("name") String name) {
		String resPayload =  ", welcome..."+name;//PKS, welcome...
		return new ResponseEntity<>(resPayload, HttpStatus.OK);
		
	}
	@GetMapping("/hello")
	public String Hello() {
		String responsePlayload="hello-----";
		return responsePlayload ;
	}
}
