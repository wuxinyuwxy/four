package com.bw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka1ServerStart {
    public static void main(String[] args) {
        SpringApplication.run(Eureka1ServerStart.class,args);
    }
}
