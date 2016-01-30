package com.zuoan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by XUJY on 2016/1/18.
 */
@Configuration//配置控制
@EnableAutoConfiguration()//启用自动配置
@ComponentScan//组件扫描
@ImportResource(locations = "classpath*:spring-servlet.xml")
public class ApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class);
    }
}
