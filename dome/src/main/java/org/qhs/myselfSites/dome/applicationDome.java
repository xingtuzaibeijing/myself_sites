package org.qhs.myselfSites.dome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
public class applicationDome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		SpringApplication.run(applicationDome.class, args);
	}
}
