package in.pradeep.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomecontrolllerrest {

	@GetMapping("/welcome")
	public String Getgreetmsg() {
		String wel="welcome";
		return wel;
	}
}
