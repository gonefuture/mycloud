package cn.zhku.news.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/12/2 23:12.
 * 说明：
 */
@Configuration
public class FileUploadConfiguration {

//    @Value("${custom.tmpLocation}")
//    private String tmpLocation;

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        // 设置文件大小限制 ,超出设置页面会抛出异常信息，
        // 这样在文件上传的地方就需要进行异常信息的处理了;
        factory.setMaxFileSize("10240KB"); // KB,MB
        /// 设置总上传数据总大小
        factory.setMaxRequestSize("10240KB");
        // Sets the directory location where files will be stored.
        // factory.setLocation("路径地址");
        //factory.setLocation(tmpLocation);


        return factory.createMultipartConfig();
    }





}
