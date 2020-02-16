package cn.tycoding.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AdaminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdaminApplication.class,args);
    }
}
