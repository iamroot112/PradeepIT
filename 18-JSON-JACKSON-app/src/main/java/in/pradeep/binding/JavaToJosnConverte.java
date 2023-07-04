package in.pradeep.binding;

import java.io.File;



import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJosnConverte {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Author author=new Author();
		author.setAuthorname("pradeep");
		author.setAuthorEmailid("ss@gmail.com");
		author.setAuthorPhone(799946161L);
		
		Book book = new Book();
		book.setId(11);
		book.setName("java-book");
		book.setPrice(20.00);
		book.setAuthor(author);
		
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new  File("book.json"), book);
		System.out.println("convert java object to json");

	}

}
