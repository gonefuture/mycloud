package cn.zhku.config;


import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/12/18 22:17.
 * 说明：日志配置类
 */
public class LogConfiguration {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
