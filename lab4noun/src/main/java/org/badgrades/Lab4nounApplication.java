package org.badgrades;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab4nounApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab4nounApplication.class, args);
	}
}
