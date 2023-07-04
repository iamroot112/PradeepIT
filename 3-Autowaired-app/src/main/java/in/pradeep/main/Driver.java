package in.pradeep.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.pradeep.bean.Car;

public class Driver {
public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("spring-beans.xml");
	Car car=context.getBean("car",Car.class);
	car.drive();
}
}
