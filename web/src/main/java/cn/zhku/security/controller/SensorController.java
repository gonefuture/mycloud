package cn.zhku.security.controller;

import cn.zhku.mysql.entity.Sensor;
import cn.zhku.security.service.SensorConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/12/24 19:05.
 * 说明：
 */
@RestController
@RequestMapping("/sensor")
public class SensorController  {

    @Autowired
    private SensorConsumerService sensorConsumerService;

    @RequestMapping("first")
    public Sensor getFirstSensor() {
        return sensorConsumerService.getFirstSensor();
    }

}
