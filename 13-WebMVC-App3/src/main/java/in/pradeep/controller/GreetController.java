package in.pradeep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {
	@GetMapping("/greet")
	public String getMsgGreet(Model model) {
		String s= "good moring....... ";
		model.addAttribute("msg", s);
		return "greet";
	}

}
