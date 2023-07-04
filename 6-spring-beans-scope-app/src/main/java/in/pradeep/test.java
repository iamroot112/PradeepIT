package in.pradeep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean.xml");
Car c1=context.getBean("car",Car.class);
System.out.println(c1.hashCode());
	}

}
