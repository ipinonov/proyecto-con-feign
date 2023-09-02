package com.example.proyectoconfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProyectoConFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProyectoConFeignApplication.class, args);
    }

}
