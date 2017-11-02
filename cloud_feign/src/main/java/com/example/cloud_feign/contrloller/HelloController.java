package com.example.cloud_feign.contrloller;

import com.example.cloud_feign.Service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date:Created by luzy on 2017/10/30.
 * @Description:
 */
@RestController
public class HelloController {
    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
