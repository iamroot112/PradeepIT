 package in.pradeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import in.pradeep.security.AppSecurity;

@SpringBootApplication
@ComponentScan(basePackages= {"in.walmart","in.pradeep"})
public class SpringbootComponentscanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootComponentscanApplication.class, args);
	}
	/*@Bean
	public AppSecurity createinstance() {
	AppSecurity as =new AppSecurity();
	return as;
	}*/

}
