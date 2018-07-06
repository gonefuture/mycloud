package cn.zhku.api.iot.service;

import cn.zhku.mysql.entity.Temhum;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/12/17 21:46.
 * 说明：
 */

@Component
public class TemhumServiceFallback implements TemhumService {
    @Override
    public Temhum showTemhum() {
        Temhum temhum = new Temhum();
        temhum.setCreatetime(new Date());
        temhum.setTemperature(-100.0f);
        temhum.setHumidity(-100.0f);
        return temhum;
    }
}
