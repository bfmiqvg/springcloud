package com.example.cloud_ribbon.contrloller;

import com.example.cloud_ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.soap.Addressing;

/**
 * @Date:Created by luzy on 2017/10/30.
 * @Description:
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.helloService(name);
    }
}
