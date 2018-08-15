package com.zhangl.gateway;

import com.zhangl.gateway.filter.AccessFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class GateWayApplication {

    private final static Logger logger = LoggerFactory.getLogger(GateWayApplication.class);

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class, args);
        logger.info("********SpringBoot Start Success********");
    }

}
