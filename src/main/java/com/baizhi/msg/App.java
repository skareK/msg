package com.baizhi.msg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.baizhi.msg.dao")
@SpringBootApplication
//@ComponentScan(basePackages = "com.baizhi.msg.service.impl")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
