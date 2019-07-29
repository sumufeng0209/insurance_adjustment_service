package org.java;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableRedisHttpSession
@EnableTransactionManagement
@EnableEurekaClient
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class InsuranceAdjustmentServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(InsuranceAdjustmentServiceApplication.class, args);
    }

}
