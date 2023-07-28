package p1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "controller" })
public class GitexpApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitexpApplication.class, args);
	}

}
