package chewyt.project;

import java.util.Collection;
import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SsfDay11Application {

	public static void main(String[] args) {
		// SpringApplication.run(SsfDay11Application.class, args);
		SpringApplication app = new SpringApplication(SsfDay11Application.class);

		String port = "3000";
		ApplicationArguments cliOpts = new DefaultApplicationArguments(args);
		if (cliOpts.containsOption("port")) {
			port = cliOpts.getOptionValues("port").get(0);
		}
		app.setDefaultProperties(
			Collections.singletonMap("server.port",port)
		);
		System.out.printf("Application started on port %s\n", port);
		app.run(args);

	}

}
