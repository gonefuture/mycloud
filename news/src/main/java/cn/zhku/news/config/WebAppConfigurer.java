package cn.zhku.news.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/12/2 23:09.
 * 说明：
 */

@Configuration
public class WebAppConfigurer extends WebMvcConfigurerAdapter {



    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }
}