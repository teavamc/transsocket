package com.teavamc.transsocket.client;

import com.teavamc.transsocket.server.TcpServerHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author 张超 teavamc
 * @Description:TODO
 * @ClassName TcpClientHandler
 * @date 2019/5/4 17:26
 **/
public class TcpClientHandler extends SimpleChannelInboundHandler<Object> {

    private static Logger log = LogManager.getLogger(TcpServerHandler.class);

    private final String SUCCEED = "1";
    private final String FAILED = "0";
    private final String REC = "TCP Client接收的消息:";

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (SUCCEED.equals(msg)){
            log.info(REC + "成功");
        }else if(FAILED.equals(msg)){
            log.info(REC + "失败");
        }else {
            log.warn(REC + "Server回传的数据异常");
        }
    }

}
