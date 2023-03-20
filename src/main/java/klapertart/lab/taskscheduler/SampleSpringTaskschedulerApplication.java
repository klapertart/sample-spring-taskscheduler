package klapertart.lab.taskscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class SampleSpringTaskschedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringTaskschedulerApplication.class, args);
	}

}
