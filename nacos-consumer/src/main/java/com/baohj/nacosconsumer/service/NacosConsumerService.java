package com.baohj.nacosconsumer.service;

import com.baohj.nacosconsumer.NacosConsumerClient;
import org.springframework.stereotype.Component;

/**
 * @author: baohj
 * created time: 2021/7/9 16:11
 * description
 */
@Component
public class NacosConsumerService implements NacosConsumerClient {

    public String getErrorInfo(){
        return "error,fallback";
    }

    @Override
    public String hi(String name) {
        return "error,fallback";
    }
}
