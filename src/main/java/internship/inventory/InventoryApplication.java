package internship.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

//@EntityScan("models")
@Configuration
@SpringBootApplication
@RestController


public class InventoryApplication {


	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
	}



}
