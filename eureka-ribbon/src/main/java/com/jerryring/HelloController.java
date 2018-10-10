package com.jerryring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author broker
 * @version v1.0
 * @date 2018-10-10
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;


    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
