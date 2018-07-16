package com.sdk4.cloud.base.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sh on 2018/7/16.
 */
@RestController
public class PingController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/ping")
    public String ping() {
        return "ping back from " + port + ", " + System.currentTimeMillis();
    }
}
