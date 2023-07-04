package in.pradeep.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava {

	public static void main(String[] args) throws Exception {
		
		File  jsonFile=new File("book.json");
		ObjectMapper mapper=new ObjectMapper();
		
		Book book=mapper.readValue(jsonFile, Book.class);
		System.out.println(book);

	}

}
