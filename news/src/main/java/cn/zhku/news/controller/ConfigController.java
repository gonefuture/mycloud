package cn.zhku.news.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/12/24 10:00.
 * 说明：
 */

@RestController
@RefreshScope
public class ConfigController {

    @Value("${myconfig}")
    private String hello;

    @RequestMapping("/myconfig")
    public String from() {
        return  this.hello;
    }


}
