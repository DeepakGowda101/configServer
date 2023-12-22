package com.configserver.configservermicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigserverMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverMicroserviceApplication.class, args);
	}

}
