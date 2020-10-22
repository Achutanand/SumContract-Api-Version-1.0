package com.sum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
/*
 * Access the URL to TRY OUT the EndPoints :
 * http://localhost:8888/swagger-ui.html#/sum-contract-controller
 */
public class SumContractServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SumContractServiceApplication.class, args);
	}

}
