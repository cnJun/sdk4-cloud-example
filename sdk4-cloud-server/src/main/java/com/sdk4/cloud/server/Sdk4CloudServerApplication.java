package com.sdk4.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Sdk4CloudServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sdk4CloudServerApplication.class, args);
    }

}