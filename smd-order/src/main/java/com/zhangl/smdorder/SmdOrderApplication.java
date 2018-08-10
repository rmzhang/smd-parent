package com.zhangl.smdorder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SmdOrderApplication {

    private final static Logger logger = LoggerFactory.getLogger(SmdOrderApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SmdOrderApplication.class, args);
        logger.info("********SpringBoot Start Success********");
    }
}
