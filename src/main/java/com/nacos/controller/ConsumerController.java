package com.nacos.controller;

import com.nacos.Feign.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @auther: YCC0081
 * @date: 2021/7/30
 */
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DemoService echoService;

//    @RequestMapping(value = "/echo-rest/{str}", method = RequestMethod.GET)
//    public String rest(@PathVariable String str) {
//        return restTemplate.getForObject("http://service-provider/echo/" + str,
//                String.class);
//    }

    @RequestMapping(value = "/echo-feign/{str}", method = RequestMethod.GET)
    public String feign(@PathVariable String str) {
        return echoService.test(str);
    }
}
