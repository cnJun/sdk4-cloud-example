package com.sdk4.cloud.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sh on 2018/7/4.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableEurekaClient
public class Sdk4CloudBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sdk4CloudBaseApplication.class, args);
    }


}
