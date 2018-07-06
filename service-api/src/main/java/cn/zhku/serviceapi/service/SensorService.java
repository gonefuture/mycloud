package cn.zhku.serviceapi.service;


import cn.zhku.mysql.entity.Sensor;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/12/24 18:54.
 * 说明：
 */

@RequestMapping("/sensor")
public interface SensorService {

    @RequestMapping("/first")
    Sensor getFirstSensor();

}
