package com.nova.lyn.storage.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName StorageApplication
 * @Description TODO
 * @Author Lyn
 * @Date 2019/4/19 0019 下午 2:04
 * @Version 1.0
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.nova"})
@EnableDiscoveryClient
public class StorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(StorageApplication.class, args);
    }
}
