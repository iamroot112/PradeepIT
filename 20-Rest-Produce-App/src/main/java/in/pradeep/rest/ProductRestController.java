package in.pradeep.rest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pradeep.Binding.product;

@RestController
public class ProductRestController {
	
//@GetMapping("/product")
	@GetMapping(value="/product",produces= {/*"application/xml",*/"application/json"})
	public ResponseEntity<product> getproduct(){
		product product1=new product();
		product1.setPID(11);
		product1.setPName("pen");
		product1.setPrice(122.11);
		return new ResponseEntity<>(product1,HttpStatus.OK);
	}
	@GetMapping("/products")
	public ResponseEntity<List<product>> getproducts(){
		product p1=new product(11,"ds",12.00);
		product p2=new product(12,"asbs",5131.00);
		List<product> products=Arrays.asList(p1,p2);
		
		return new ResponseEntity<>(products,HttpStatus.OK);
	}
}

