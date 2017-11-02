package com.example.cloud_feign.Service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Date:Created by luzy on 2017/10/30.
 * @Description:
 */
//通过@ FeignClient（“服务名”），来指定调用哪个服务,调用hello接口
@FeignClient(value = "hello-service")
public interface SchedualServiceHi {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
