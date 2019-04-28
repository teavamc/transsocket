package com.teavamc.transsocket;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TranssocketApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TranssocketApplication.class, args);
    }

    /**
        * 实现CommandLineRunner接口重写run方法
        *
        * CommandLineRunner接口用于实现在应用初始化后，去执行一段代码块逻辑，
        * 这段初始化代码在整个应用生命周期内只会执行一次
        *
        * @author 张超 teavamc
        * @date 2019/4/29
        * @param [strings]
        * @return void
        */
    @Override
    public void run(String... strings){
    }

}
