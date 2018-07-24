package com.tnikhil.kafka.receiver.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages= "com.tnikhil")
public class SpringBootKafkaReceiverApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaReceiverApplication.class, args);
		System.out.println("Started...");
	}
}