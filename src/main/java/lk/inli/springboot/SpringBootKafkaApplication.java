package lk.inli.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootKafkaApplication {
	public static void main(String[] args) {

		SpringApplication.run(new Class<?>[] { SpringBootKafkaApplication.class }, args);
	}
}
