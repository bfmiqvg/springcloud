package com.example.cloud2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @Date:Created by luzy on 2017/10/27.
 * @Description:
 */
@RestController
public class HelloController {
    private final Logger logger = Logger.getLogger("HelloController.class");
    @Autowired
    private DiscoveryClient client;

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/hello, host:" + instance.getHost()+"，service id:"+instance.getServiceId()) ;
        return " host:" + instance.getHost()+",port:"+port+"，service id:"+instance.getServiceId();
    }
}
