package com.nova.lyn.accountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.nova"})
public class AccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication
                .run(AccountServiceApplication.class, args);
    }

}
