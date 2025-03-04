package com.deploy.deploy_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.deploy.deploy_study.model")
public class DeployStudyApplication {
	public static void main(String[] args) {
		SpringApplication.run(DeployStudyApplication.class, args);
	}
}
