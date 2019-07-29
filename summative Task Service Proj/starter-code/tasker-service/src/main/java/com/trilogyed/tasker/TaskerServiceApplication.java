package com.trilogyed.tasker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class TaskerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskerServiceApplication.class, args);
	}

}
