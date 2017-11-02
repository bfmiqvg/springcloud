package com.example.cloud_feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients		//开启Feign的功能
@SpringBootApplication
public class CloudFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudFeignApplication.class, args);
	}
}
