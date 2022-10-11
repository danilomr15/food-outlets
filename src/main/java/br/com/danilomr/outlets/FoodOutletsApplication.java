package br.com.danilomr.outlets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "br.com.danilomr.outlets.client")
public class FoodOutletsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodOutletsApplication.class, args);
	}

}
