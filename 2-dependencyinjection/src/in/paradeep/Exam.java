package in.paradeep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
	Student a =context.getBean("student",Student.class);
	a.displaystudentinfo();
	//context.getBean("student2",Student.class);
}
}
