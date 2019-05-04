package com.teavamc.transsocket;

import com.teavamc.transsocket.server.TcpServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TranssocketApplication implements CommandLineRunner {

    private static Logger log = LogManager.getLogger(TranssocketApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TranssocketApplication.class, args);
        try {
            TcpServer.run();
            log.info("TCP服务器启动成功...");
        }catch (Exception e){
            log.info("TCP服务器启动失败...");
        }
        // TcpServer.shutdown();
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
