package com.capgemini.currencyconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.capgemini.currencyconversionservice")

public class CurrencyconversionserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyconversionserviceApplication.class, args);
	}

}
