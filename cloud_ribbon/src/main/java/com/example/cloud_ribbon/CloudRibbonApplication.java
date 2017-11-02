package com.example.cloud_ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient	//通过@EnableDiscoveryClient向服务中心注册
@EnableHystrix		//启用断路器
public class CloudRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudRibbonApplication.class, args);
	}

	@Bean
	@LoadBalanced	//表明这个restRemplate开启负载均衡的功能
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
