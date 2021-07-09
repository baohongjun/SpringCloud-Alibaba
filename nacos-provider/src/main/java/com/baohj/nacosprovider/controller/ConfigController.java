package com.baohj.nacosprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: baohj
 * created time: 2021/7/9 14:50
 * description
 */
@RestController
@RefreshScope           //实现配置的热加载
public class ConfigController {

    @Value("${username:lily}")
    private String username;

    @RequestMapping("/username")
    public String get() {
        return username;
    }

}
