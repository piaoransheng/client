package com.test.request;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //1。连接服务端
        Socket socket = new Socket("127.0.0.1",6666);

        //2.封装要传递的信息 包名 类名 方法名 参数名称
        RpcInfo rpcInfo = new RpcInfo();
        rpcInfo.setPackageName("com.test.web.dao");
        rpcInfo.setClazzName("OrderDao");
        rpcInfo.setMethodName("server");
        Object[] params = new Object[]{"华安"};
        rpcInfo.setArgs(params);

        //3传递 objectOutputStream.writeObject(rpcInfo);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        objectOutputStream.writeObject(rpcInfo);
        objectOutputStream.flush();
        objectOutputStream.close();
    }
}
