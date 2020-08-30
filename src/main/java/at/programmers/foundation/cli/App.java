package at.programmers.foundation.cli;

import lombok.NonNull;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class App implements CommandLineRunner {

	public static void main(final @NonNull String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(final @NonNull String... args) {
		log.debug("Application started.");

		for (int i = 0; i < args.length; ++i) {
			log.info("args[{}]: {}", i, args[i]);
		}
	}

}
