package com.afroz.blr.sprinbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.afroz.blr"})
public class PermutationApi 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(PermutationApi.class, args);
	}

}
