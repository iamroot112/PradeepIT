package in.pradeep.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetrest {
	@Autowired
	private welcomeapi wlcapi;

	@GetMapping("/greet")
	public String Greetmsg() {
		String gr=" good morning ";
		String invokewelcome = wlcapi.invokewelcome();
		return gr+"---"+ invokewelcome;
		
	}
}
