package com.xingod;

import org.dromara.x.file.storage.spring.EnableFileStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author：fanxin
 * @Package：com.xingod
 * @Project：springboot3-dromara
 * @name：Application
 * @Date：2023/12/20 16:06
 */
@EnableFileStorage
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
