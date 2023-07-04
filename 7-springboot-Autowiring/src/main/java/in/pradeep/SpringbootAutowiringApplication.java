package in.pradeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootAutowiringApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext	context =SpringApplication.run(SpringbootAutowiringApplication.class, args);
	ReportService reportService =context.getBean(ReportService.class);
	reportService.generateReport();
	}

}
