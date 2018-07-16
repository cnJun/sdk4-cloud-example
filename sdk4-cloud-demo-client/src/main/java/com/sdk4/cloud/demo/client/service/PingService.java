package com.sdk4.cloud.demo.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sh on 2018/7/4.
 */
@Service
public class PingService {
    @Autowired
    RestTemplate restTemplate;

    public String ping() {
        return restTemplate.getForObject("http://sdk4-cloud-base/ping", String.class);
    }
}
