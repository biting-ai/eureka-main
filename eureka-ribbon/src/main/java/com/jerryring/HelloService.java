package com.jerryring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author broker
 * @version v1.0
 * @date 2018-10-10
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://server-client/hi?name=" + name, String.class);
    }
}
