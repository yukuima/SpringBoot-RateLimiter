package com.myk.learning.ratelimiter.service.impl;

import com.myk.learning.ratelimiter.annotation.RateLimiterAnnotation;
import com.myk.learning.ratelimiter.service.AopTestService;
import org.springframework.stereotype.Service;

/**
 * Aop test service
 * <p/>
 * Created in 2018.11.19
 * <p/>
 *
 * @author myk
 */
@Service
public class AopTestServiceImpl implements AopTestService {
    @Override
    @RateLimiterAnnotation(name = "v1", count = 5.0)
    public String testRateLimiter(Double count, String context) {
        System.out.println(count + "   " + context);
        return "测试";
    }

    @Override
    @RateLimiterAnnotation(name = "v2", count = 7.0)
    public String testRateLimiterv2(Double count, String context) {
        System.out.println("V2版本发出:" + count + "   " + context);
        return "测试第二个";
    }
}
