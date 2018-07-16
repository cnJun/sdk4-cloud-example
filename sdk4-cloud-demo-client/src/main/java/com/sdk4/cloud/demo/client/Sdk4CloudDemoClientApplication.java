package com.sdk4.cloud.demo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sh on 2018/7/4.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class Sdk4CloudDemoClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sdk4CloudDemoClientApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
