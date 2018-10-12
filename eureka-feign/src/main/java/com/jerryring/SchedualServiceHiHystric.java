package com.jerryring;

import org.springframework.stereotype.Component;

/**
 * @author broker
 * @version v1.0
 * @date 2018-10-10
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceClient {
    @Override
    public String callFromClientOne(String name) {
        return "sorry" + name;
    }
}
