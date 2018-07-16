package com.sdk4.cloud.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import zipkin.server.internal.EnableZipkinServer;

/**
 * Created by sh on 2018/7/4.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@RestController
@EnableZipkinServer
public class Sdk4CloudMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sdk4CloudMonitorApplication.class, args);
    }

}
