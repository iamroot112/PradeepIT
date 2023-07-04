package in.pradeep.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.pradeep.binding.Book;

@RestController
public class BookRestcontroller {
	@PostMapping(value="/book",consumes= {"application/json","application/xml"})
	public ResponseEntity<String> addBook(@RequestBody Book book){
		System.out.println(book);
		String msg="book added sucessfully";
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		
	}

}
