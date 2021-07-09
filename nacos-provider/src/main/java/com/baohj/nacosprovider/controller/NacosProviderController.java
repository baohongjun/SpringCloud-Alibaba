package com.baohj.nacosprovider.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: baohj
 * created time: 2021/7/9 13:53
 * description
 */
@RestController
public class NacosProviderController {

    Logger logger= LoggerFactory.getLogger(NacosProviderController.class);

    /**
     * 关于@SentinelResource 注解
     *  1.value：资源名称，必需项（不能为空）
     *  2.entryType：entry 类型，可选项（默认为 EntryType.OUT）
     *  3.blockHandler/blockHandlerClass: blockHandler 对应处理 BlockException 的函数名称，可选项
     *  4.fallback：fallback 函数名称，可选项，用于在抛出异常的时候提供 fallback 处理逻辑。
     * @param name
     * @return
     */
    @GetMapping("/hi")
    @SentinelResource(value="hi")
    public String hi(@RequestParam(value = "name")String name){

        return "hi nacosProvider "+name;
    }

}
