package com.team4.albumsapp.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AlbumsAppApiConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlbumsAppApiConfigServerApplication.class, args);
	}

}
