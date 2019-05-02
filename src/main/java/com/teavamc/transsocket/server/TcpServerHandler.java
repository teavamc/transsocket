package com.teavamc.transsocket.server;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author 张超 teavamc
 * @Description:TODO
 * @ClassName TcpServerHandler
 * @date 2019/5/2 15:05
 **/
public class TcpServerHandler extends SimpleChannelInboundHandler<Object> {




    /**
     * 打印接收到的内容，并回传
     * @author 张超 teavamc
     * @date 2019/5/2
     * @param [ctx, msg]
     * @return void
     */
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (msg.equals("01")){
            System.out.println("收到开启风扇指令：" + msg);
            ctx.channel().writeAndFlush("单片机已经开启风扇");
        }else if(msg.equals("02")){
            System.out.println("收到开启洒水指令：" + msg);
            ctx.channel().writeAndFlush("单片机已经执行洒水");
        }else {
            System.out.println("不明指令：" + msg);
            ctx.channel().writeAndFlush("指令错误，请检查");
        }
    }



    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.out.println("exceptionCaught!cause:" + cause.toString());
        ctx.close();
    }





}
