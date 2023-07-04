package in.pradeep.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppSecurity {
public AppSecurity() {
	// TODO Auto-generated constructor stub
	System.out.println("appsecurity:: cons");
	
}
@Bean
public AppSecurity createinstance() {
AppSecurity as =new AppSecurity();
return as;
}
}