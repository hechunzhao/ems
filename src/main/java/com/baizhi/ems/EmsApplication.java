package com.baizhi.ems;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baizhi.ems.dao")
public class EmsApplication {
    public static void main(String[] args) {
        System.out.println("暗杀哈哈哈哈");
        SpringApplication.run(EmsApplication.class, args);
    }

}
