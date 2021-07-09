package com.baohj.nacosconsumer;

import com.baohj.nacosconsumer.service.NacosConsumerService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: baohj
 * created time: 2021/7/9 14:21
 * description
 */
@FeignClient(value = "nacos-provider",fallback = NacosConsumerService.class)
public interface NacosConsumerClient {

    @GetMapping("/hi")
    String hi(@RequestParam String name);

}
