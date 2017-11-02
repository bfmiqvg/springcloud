package com.example.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer	//启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication	//项目启动配置   
public class CloudApplication {

	public static void main(String[] args) {
		Systesm.out.println("测试")
		SpringApplication.run(CloudApplication.class, args);
	}
}
