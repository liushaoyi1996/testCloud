package com.test;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.test.dao")
public class DeptProvider8001_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_App.class, args);
    }
}
