package com.bw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserServerStart {
    public static void main(String[] args) {
        SpringApplication.run(UserServerStart.class,args);
    }
}
