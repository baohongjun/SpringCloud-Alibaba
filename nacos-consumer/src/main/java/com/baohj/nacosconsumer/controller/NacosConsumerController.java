package com.baohj.nacosconsumer.controller;

import com.baohj.nacosconsumer.NacosConsumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: baohj
 * created time: 2021/7/9 14:06
 * description
 */
@RestController
public class NacosConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hi-resttemplate")
    public String hiResttemplate(){
        return restTemplate.getForObject("http://nacos-provider/hi?name=resttemplate",String.class);

    }

    @Autowired
    NacosConsumerClient nacosConsumerClient;
    @GetMapping("/hi-feign")
    public String hiFeign(){
        return nacosConsumerClient.hi("feign");

    }

}
