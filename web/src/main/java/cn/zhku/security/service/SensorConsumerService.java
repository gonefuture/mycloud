package cn.zhku.security.service;

import cn.zhku.serviceapi.service.SensorService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/12/24 19:11.
 * 说明：
 */

@FeignClient("IOT-SERVICE")
public interface SensorConsumerService extends SensorService{

}
