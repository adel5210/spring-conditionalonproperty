package com.adel.conditionalonproperty;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class ConditionalonpropertyApplication implements CommandLineRunner {

	private final DBService dbService;

	public static void main(String[] args) {
		SpringApplication.run(ConditionalonpropertyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Selecting DB service {}", dbService.serviceName());
	}
}
