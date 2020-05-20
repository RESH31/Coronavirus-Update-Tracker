package com.rrn.coronavirustracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@ComponentScan(basePackages= {"com.rrn.coronavirustracker.Controller"})
public class CoronaVirusTrackerApplication {

		public static void main(String[] args) {
		SpringApplication.run(CoronaVirusTrackerApplication.class, args);
	}

}
