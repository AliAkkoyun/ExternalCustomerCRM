package com.ExternalCustomerCRM.External.User.Data.Pool;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExternalUserDataPoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalUserDataPoolApplication.class, args);
	}

	@Bean
	public ModelMapper GetModelMapper(){
		return new ModelMapper();
	}
}
