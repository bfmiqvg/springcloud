package com.example.cloud2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient	//通过@EnableDiscoveryClient向服务中心注册
@SpringBootApplication	//启动注解
public class Cloud2Application {

	public static void main(String[] args) {
		SpringApplication.run(Cloud2Application.class, args);
	}
}
