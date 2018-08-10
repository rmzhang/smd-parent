package com.zhangl.smdservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class smdServiceApplication {

    private final static Logger logger = LoggerFactory.getLogger(smdServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(smdServiceApplication.class, args);
        logger.info("********SpringBoot Start Success********");
    }
}
