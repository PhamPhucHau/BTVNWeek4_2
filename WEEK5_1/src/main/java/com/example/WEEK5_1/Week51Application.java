package com.example.WEEK5_1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class Week51Application {

	public static void main(String[] args) {
		SpringApplication.run(Week51Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String,String> kafkaTemplate)
{
	return args -> {
		System.out.println(kafkaTemplate);
		kafkaTemplate.send("likelion","hello kafka");
	};
}

}
