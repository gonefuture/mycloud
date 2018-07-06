package cn.zhku.api.iot.service;

import cn.zhku.config.LogConfiguration;
import cn.zhku.mysql.entity.Temhum;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/12/17 21:08.
 * 说明：
 */

@FeignClient(value = "web",fallback = TemhumServiceFallback.class, configuration = LogConfiguration.class)
public interface TemhumService {

    @RequestMapping("/api/iot/temhum/show")
    Temhum showTemhum();
}
