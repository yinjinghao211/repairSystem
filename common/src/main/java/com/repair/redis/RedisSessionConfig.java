package com.repair.redis;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * auther   kangwang
 */
@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {
}