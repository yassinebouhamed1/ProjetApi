package com.ncq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ncq.dao.WorkflowRepository;

@SpringBootApplication
public class ProjetApiApplication {
	@Autowired
	WorkflowRepository workflowRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProjetApiApplication.class, args);
		
		
	}

}
