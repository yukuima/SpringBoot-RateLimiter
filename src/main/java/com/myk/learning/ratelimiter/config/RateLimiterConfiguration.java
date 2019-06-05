package com.myk.learning.ratelimiter.config;

import com.myk.learning.ratelimiter.service.RateLimiterService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Rate limiter configuration
 * Created in 2019.01.08
 *
 * @author myk
 */
@Configuration
public class RateLimiterConfiguration {
    /**
     * The 限制次数.
     */
    @Value("${limit.count}")
    Integer count;

    /**
     * Rate limiter service rate limiter service.
     *
     * @return the rate limiter service
     */
    @Bean
    public RateLimiterService rateLimiterService() {
        return new RateLimiterService(count);
    }
}
