package in.pradeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

import in.pradeep.entity.Player;
import in.pradeep.repository.PlayerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
		PlayerRepository playerRepository=context.getBean(PlayerRepository.class);
	Player p1=new Player();
	p1.setPlayerId(02);
	p1.setPlayerName("kumar");
	p1.setPlayerAge(35);
	p1.setLocation("india");
		playerRepository.save(p1);// upsert method use for both update and insert 
		System.out.println("--------------insest data in tabel---------");
	}

}
