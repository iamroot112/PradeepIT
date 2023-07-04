package in.pradeep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class welcomecontroller {
	@GetMapping("/welcome")
	public ModelAndView welcomemsg(){  
	ModelAndView mav= new ModelAndView();
	mav.addObject("msg", "welcome to strat page");
	mav.setViewName("welcome");
	return mav;
	}
}
 