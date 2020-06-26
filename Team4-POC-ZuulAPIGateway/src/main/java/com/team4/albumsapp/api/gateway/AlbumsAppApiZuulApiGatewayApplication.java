package com.team4.albumsapp.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class AlbumsAppApiZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlbumsAppApiZuulApiGatewayApplication.class, args);
	}

}
