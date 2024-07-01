package com.example.demo;

import org.springframework.boot.SpringApplication;

public class TestDocumentAssistantApplication {

	public static void main(String[] args) {
		SpringApplication.from(DocumentAssistantApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
