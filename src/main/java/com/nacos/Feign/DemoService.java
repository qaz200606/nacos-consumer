package com.nacos.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @auther: YCC0081
 * @date: 2021/7/30
 */
@FeignClient(name = "service-pro")
public interface DemoService {
    @GetMapping(value = "/test/{name}")
    String test(@PathVariable("name") String name);
}
