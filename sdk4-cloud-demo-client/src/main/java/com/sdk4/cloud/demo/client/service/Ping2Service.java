package com.sdk4.cloud.demo.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by sh on 2018/7/5.
 */
@FeignClient(value = "sdk4-cloud-base")
public interface Ping2Service {

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    String ping();

}
