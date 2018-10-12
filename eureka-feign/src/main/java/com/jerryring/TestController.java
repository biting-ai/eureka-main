package com.jerryring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author broker
 * @version v1.0
 * @date 2018-10-10
 */
@RestController
public class TestController {

    @Autowired
    SchedualServiceClient schedualServiceClient;

    @GetMapping(value = "/hi")
    public String callHi(@RequestParam String name) {

        return schedualServiceClient.callFromClientOne(name);
    }
}
