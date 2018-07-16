package com.sdk4.cloud.demo.client.web;

import com.sdk4.cloud.demo.client.service.PingService;
import com.sdk4.cloud.demo.client.service.Ping2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sh on 2018/7/4.
 */
@RestController
public class PingControler {

    @Autowired
    PingService pingService;

    @Autowired
    Ping2Service ping2Service;

    @RequestMapping(value = "/ping1")
    public String ping1() {
        return pingService.ping();
    }

    @RequestMapping(value = "/ping2")
    public String ping2() {
        return ping2Service.ping();
    }

}
