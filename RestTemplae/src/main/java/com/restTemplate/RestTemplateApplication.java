package com.restTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class,args);
    }

    //在该启动类启动的时候，就会在IOC容器中去创建一个RestTemplate的实例对象，然后其他的模块就可以RestTemplate实例去调用其他模块的方法了
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
