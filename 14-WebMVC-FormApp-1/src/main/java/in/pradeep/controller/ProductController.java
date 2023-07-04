package in.pradeep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.pradeep.binding.Product;

@Controller
public class ProductController {

	@GetMapping("/")
	public String getProductForm(Model model) {
		// TODO Auto-generated method stub
		
		Product obj=new Product();
		model.addAttribute("product", "obj");
		return "index";
	}

	@PostMapping("/product")
	public String handleFormSubmit(Product product, Model model) {
		System.out.println("product");
		model.addAttribute("msg", "productsavesucessfully");
		return "success";

	}
}
