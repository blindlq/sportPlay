package com.deyunjiaoyu.sportplay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.deyunjiaoyu.sportplay.dao")
@SpringBootApplication
public class SportPlayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SportPlayApplication.class, args);
    }

}
