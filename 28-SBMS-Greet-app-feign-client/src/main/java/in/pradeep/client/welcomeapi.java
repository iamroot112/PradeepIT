package in.pradeep.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="WELCOME-API")
public interface welcomeapi {
@GetMapping("/welcome")
public String invokewelcome();
}
