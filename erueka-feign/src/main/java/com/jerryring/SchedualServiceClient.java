package com.jerryring;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author broker
 * @version v1.0
 * @date 2018-10-10
 */

@FeignClient(value = "server-client",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceClient {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String callFromClientOne(@RequestParam(value = "name") String name);
}
