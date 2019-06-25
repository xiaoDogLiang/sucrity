package com.sucritydemo.sucrity.config;

import com.sucritydemo.sucrity.service.HelloService;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration指明当前类是一个配置类；替代spring配置文件
 */
@Configuration
public class WebConfig {

    //讲方法的返回值添加到容器中；容器中这个组件的默认id就是方法名
    @Bean
    public HelloService helloService() {
        return new HelloService();
    }

}
