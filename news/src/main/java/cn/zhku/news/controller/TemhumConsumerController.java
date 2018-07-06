package cn.zhku.news.controller;

import cn.zhku.api.iot.service.TemhumService;
import cn.zhku.mysql.entity.Temhum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/12/17 21:25.
 * 说明：
 */
@RestController
public class TemhumConsumerController {
    @Autowired
    private TemhumService temhumService;

    @GetMapping(value = "/temhum")
    public Temhum TemhumConsumer() {
        return temhumService.showTemhum();
    }
}
