package in.pradeep;
//import org.spring
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	System.out.println("config loaded");
	Sim sim= context.getBean("sim", Sim.class);
	sim.calling();
	sim.data();
	/*Airtel air=context.getBean("airtrl1",Airtel.class);
	air.calling();
	air.data();*/
	
}
}
