package cn.zhku.news.controller;

import cn.zhku.mysql.entity.Sensor;
import cn.zhku.mysql.repository.SensorRepository;
import cn.zhku.serviceapi.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/12/24 19:19.
 * 说明：
 */

@RestController
@RequestMapping("/iot")
public class SensorController  implements SensorService{

    @Autowired
    private SensorRepository sensorRepository;

    @Override
    @RequestMapping("/sensor/first")
    public Sensor getFirstSensor() {
        return sensorRepository.findTop1ByOrderByCreatetimeDesc();
    }
}
