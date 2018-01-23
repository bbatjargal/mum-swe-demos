package mum.swe.demosecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("mum.swe.demosecurity")
public class DemosecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemosecurityApplication.class, args);
	}
}
