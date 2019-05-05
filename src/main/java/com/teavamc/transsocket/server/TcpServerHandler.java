package com.teavamc.transsocket.server;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author 张超 teavamc
 * @Description:TODO
 * @ClassName TcpServerHandler
 * @date 2019/5/2 15:05
 **/
public class TcpServerHandler extends SimpleChannelInboundHandler<Object> {

    private static Logger log = LogManager.getLogger(TcpServerHandler.class);

    private final String OPENFAN = "01";
    private final String CLOSEFAN = "02";
    private final String OPENAOTUFAN = "03";

    /**
        * @Description 打印接收到的内容，并回传
        * @author 张超 teavamc
        * @date 2019/5/4
        * @Time 16:25
        * @return void
        */
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (OPENFAN.equals(msg)){
            log.info("TCP Server 收到开启风扇的指令：" + msg);
            ctx.channel().writeAndFlush("单片机已经开启风扇");
        }else if(CLOSEFAN.equals(msg)){
            log.info("TCP Server 收到开启洒水的指令：" + msg);
            ctx.channel().writeAndFlush("单片机已经关闭风扇");
        }else if(OPENAOTUFAN.equals(msg)){
            log.info("TCP Server 收到开启洒水的指令：" + msg);
            ctx.channel().writeAndFlush("单片机已经开启风扇摇头");
        }else {
            log.info("不明指令：" + msg);
            ctx.channel().writeAndFlush("指令错误，请检查");
        }
    }

    /**
        * @Description 
        * @author 张超 teavamc
        * @date 2019/5/4
        * @Time 16:50
        * @return void
        */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        log.info("exceptionCaught!cause:" + cause.toString());
        ctx.close();
    }

}
