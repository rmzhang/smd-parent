package com.zhangl.smdconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SmdConfigApplication {

    private final static Logger logger = LoggerFactory.getLogger(SmdConfigApplication.class);

    public static void main(String [] args){
        SpringApplication.run(SmdConfigApplication.class);
        logger.info("*********SpringBoot Start Success!**********");
    }
}
