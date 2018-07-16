package com.sdk4.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sh on 2018/7/4.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@RestController
@EnableZuulProxy
public class Sdk4CloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sdk4CloudGatewayApplication.class, args);
    }

}
