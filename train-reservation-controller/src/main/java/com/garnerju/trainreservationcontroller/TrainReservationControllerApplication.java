package com.garnerju.trainreservationcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TrainReservationControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainReservationControllerApplication.class, args);
	}

}
