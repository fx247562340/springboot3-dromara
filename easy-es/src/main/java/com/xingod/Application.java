package com.xingod;

import org.dromara.easyes.starter.register.EsMapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author：fanxin
 * @Package：com.xingod
 * @Project：springboot3-dromara
 * @name：Application
 * @Date：2023/12/21 17:46
 */
@SpringBootApplication
@EsMapperScan("com.xingod.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
