package com.example.appconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class AppconfigserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppconfigserviceApplication.class, args);
    }

}
