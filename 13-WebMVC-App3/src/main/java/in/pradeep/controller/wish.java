package in.pradeep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class wish {
	@ResponseBody
	@GetMapping("/wish")
	public String getwish() {
		
		return "best of luck";
		
	}

}
