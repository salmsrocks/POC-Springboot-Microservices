package com.team4.albumsapp.api.albums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlbumsAppApiMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlbumsAppApiMasterApplication.class, args);
	}

}

