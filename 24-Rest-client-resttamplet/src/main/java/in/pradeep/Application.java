package in.pradeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		String url="http://";
		RestTemplate rt=new RestTemplate();
		 /*ResponseEntity<String> forEntity = */ 
		ResponseEntity<String> forEntity = rt.getForEntity(url, String.class);//Alt + Shift + L 
		/*String Body=forEntity.getBody();*/
	}

}
