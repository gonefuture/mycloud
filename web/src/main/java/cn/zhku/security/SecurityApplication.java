
package cn.zhku.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.SpringCloudApplication;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringCloudApplication
@EnableFeignClients
@EnableWebSecurity
@ComponentScan(
        basePackages = {"cn.zhku"}
)


public class SecurityApplication extends SpringBootServletInitializer {
    public SecurityApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SecurityApplication.class);
    }
}
