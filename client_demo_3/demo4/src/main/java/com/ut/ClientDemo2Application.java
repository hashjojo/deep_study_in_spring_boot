package com.ut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(ClientDemo2Application.class, args);
	}
}
