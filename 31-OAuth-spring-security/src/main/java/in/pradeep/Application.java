package in.pradeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@EnableOAuth2Sso
@EnableWebSecurity
@SpringBootApplication
@RestController
public class Application {
@GetMapping("/")
	public String msg() {
		String s= "hello";
		return s;
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
