package com.example.crud_redis_phamxuanloc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class CrudRedisPhamxuanlocApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudRedisPhamxuanlocApplication.class, args);
    }
    @Bean
    LettuceConnectionFactory jedisConnectionFactory(){

        return new LettuceConnectionFactory();
    }
    @Bean
    RedisTemplate redisTemplate(){
        RedisTemplate redisTemplate = new RedisTemplate();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        return redisTemplate;
    }
}
