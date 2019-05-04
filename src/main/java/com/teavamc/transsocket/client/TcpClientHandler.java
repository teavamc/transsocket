package com.teavamc.transsocket.client;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author 张超 teavamc
 * @Description:TODO
 * @ClassName TcpClientHandler
 * @date 2019/5/4 17:26
 **/
public class TcpClientHandler extends SimpleChannelInboundHandler<Object> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("client接收到服务器返回的消息:" + msg);
    }

}
