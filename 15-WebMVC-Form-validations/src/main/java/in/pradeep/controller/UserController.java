package in.pradeep.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.pradeep.binding.User;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String getForm(Model model) {
		 
	 User userobj=new User();
	 model.addAttribute("user",userobj);
		return "index";
		
	}
	@PostMapping("/register")
	public String handelregistationclick(@Valid User userform,BindingResult result,Model model) {
		if (result.hasErrors()) {
			return "index";
		}  
		System.out.println(userform);
		model.addAttribute("msg", "registation done....");
		return "success";
	}

}
