package com.zhangl.smdrabbitmq;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class SmdRabbitMQApplication {

    private final static Logger logger = LoggerFactory.getLogger(SmdRabbitMQApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SmdRabbitMQApplication.class, args);
        logger.info("*************Spring Boot Start Success!***************");
    }
}
