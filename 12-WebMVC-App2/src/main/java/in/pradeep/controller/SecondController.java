package in.pradeep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {
	@GetMapping("/wish")
	public ModelAndView getWish() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "All the best!! go forword");
		mav.setViewName("wish");
		return mav;
	}
}
