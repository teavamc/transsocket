package com.teavamc.transsocket.websocket;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

import java.lang.reflect.Array;
import java.util.ArrayList;


/**
 * @author 张超 teavamc
 * @Description:TODO
 * @ClassName WbHandler
 * @date 2019/5/4 15:10
 **/
public class WbHandler implements WebSocketHandler {


    private static final Logger log = LogManager.getLogger(WbHandler.class);

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus arg1) throws Exception{
        log.info("正常日志："+session.getRemoteAddress()+"断开连接！");
    }


    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception{
        log.info("正常日志："+session.getRemoteAddress()+"打开连接！");

    }

    @Override
    public void handleMessage(WebSocketSession conn, WebSocketMessage<?> message) throws Exception {
        log.info("日志信息："+message.getPayload());
    }


    @Override
    public void handleTransportError(WebSocketSession session, Throwable arg1) throws Exception {
        if(session.isOpen()){
            session.close();
        }
        log.error( "出错日志: IP:" +session.getRemoteAddress()+"  "+ arg1.getMessage() );
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }



    private void sendCMDtoSocket(WebSocketSession conn,String msg){

    }



}
