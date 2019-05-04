var ws;

function connectWS(command) {

    // 当前地址
    var path = window.location.pathname;

    // 当前主机
    var hostaddress = window.location.host + path.substring(0,path.substr(1).indexOf('/')+1);

    // 后台wb控制器url
    var target = "/wb/test";

    // 将http协议换成ws
    if (window.location.protocol == 'http:') {
        target = 'ws://' + hostaddress + target;
    } else {
        target = 'wss://' + hostaddress + target;
    }
    console.log('WebSocketServer地址：'+target);

    //创建一个针对控制器的 webSocket 对象
    if ('WebSocket' in window) {
        ws = new WebSocket(target);
    } else if ('MozWebSocket' in window) {
        ws = new MozWebSocket(target);
    } else {
        $.modal.confirm("您的浏览器不支持 WebSocket！");
        return;
    }

    // 如果没有ws对象 直播状态为2 设置对应按钮
    if(ws==null){
        console.log("WebSocket创建失败...")
    }

    // 开启WS
    ws.onopen = function () {
        //向后台发送指令
        startsent(command);
        console.log('发送控制命令');
    };

    // WS的返回信息
    ws.onmessage = function (event) {
        console.log('WS接收到的信息:' + event.data);
    };

    // WS关闭
    ws.onclose = function (event) {
        console.log('WS已关闭:' + event.data );
    };

}

function startsent(command){
    if (ws != null) {
        // 控制台打印
        console.log('开始发送Wb指令');
        // 推送信息
        ws.send(command);
    } else {
        $.modal.confirm("WebSocket 连接建立失败，请重新连接");
    }
}
