 package in.pradeep.converters;



import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import in.pradeep.binding.Person;

public class ConvertJavaToXml {
public static void main(String[] args) throws JAXBException {
	Person person=new Person();
	person.setId(10);
	person.setName("pradeep");
	person.setAge(23);
	person.setPhno(123456789L);	
	//person.setType("human");
	
	JAXBContext instance=JAXBContext.newInstance(Person.class);
	Marshaller marshaller=instance.createMarshaller();
	marshaller.marshal(person, new File("Person.xml"));
	System.out.println("xml file created");
	
}
}

