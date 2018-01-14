package com.repo.scdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ScDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScDiscoveryServerApplication.class, args);
	}
}
