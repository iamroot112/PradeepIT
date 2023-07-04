package in.pradeep.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.pradeep.bindings.Book;

@Controller
public class BookController {
	
	@GetMapping("/book")
	public String getBookData(Model model) {
		
		Book bookObj=new Book(1,"java",100);
		model.addAttribute("book",bookObj);
		return "book";
		
		
	}
	@GetMapping("/books")
	
	public String getBooksData(Model model) {
		Book b1 = new Book(101, "Spring", 400);
		Book b2 = new Book(102, "Python", 200);
		Book b3 = new Book(103, "Angular", 300);
		Book b4 = new Book(104, "AWS", 450);
		
		List<Book> booksList = Arrays.asList(b1, b2, b3, b4);
		
	model.addAttribute("books",booksList);

		return "books";
	}

}
