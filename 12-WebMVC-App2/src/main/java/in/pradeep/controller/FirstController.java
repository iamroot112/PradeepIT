package in.pradeep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
@GetMapping("/welcome")
	public ModelAndView getWelcome() {
		ModelAndView mav=new ModelAndView();
	  mav.addObject("msg", "welcome to springboot");
	  mav.setViewName("welcome");
	  
	  return mav;
	}
@GetMapping("/greet")
public ModelAndView getting() {
	ModelAndView mav=new ModelAndView();
	mav.addObject("msg", "good morning");
	mav.setViewName("greet");
	return mav;
}
}
