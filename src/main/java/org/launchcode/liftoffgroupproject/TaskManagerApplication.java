package org.launchcode.liftoffgroupproject;

import org.launchcode.liftoffgroupproject.data.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import org.launchcode.liftoffgroupproject.StorageProperties;
import org.launchcode.liftoffgroupproject.data.StorageService;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class TaskManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagerApplication.class, args);
	}

	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.deleteAll();
			storageService.init();
		};
	}

}
