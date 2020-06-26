package com.team4.albumsapp.api.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class AlbumsAppApiAccountManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlbumsAppApiAccountManagementApplication.class, args);
	}

}
