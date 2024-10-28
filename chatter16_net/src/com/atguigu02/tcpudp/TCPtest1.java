package com.atguigu02.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;



/*
* 客户端发送内容给服务端，服务端将内容打印到控制台上
* */


public class TCPtest1 {

    /* 客户端 */
    @Test
    public void client() throws IOException {
        //创建socket
//        InetAddress inetAddress = new InetAddress.getByName("127.0.0.1");
        int port = 8089;
        Socket socket = new Socket("127.0.0.1",port);
        //发送数据
        OutputStream os = socket.getOutputStream();
        os.write("你好，我是中文".getBytes("GB2312"));

        //关闭socket
        os.close();
        socket.close();
    }

    /* 服务端 */
    @Test
    public void service() throws IOException {

        //创建一个sockerserver
        int port = 8089;
        ServerSocket serverSocket = new ServerSocket(port);
        //调用accept()，接收客户端数据
        Socket os =  serverSocket.accept();

        //接收数据
        InputStream inputStream = os.getInputStream();

        byte[] bytes = new byte[5];
        int len;
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        while ((len = inputStream.read(bytes)) != -1){
//            String str = new String(bytes,0,len);
//            System.out.println(str);
            bao.write(bytes,0,len);
        }
        System.out.println(bao.toString());

        System.out.println("数据接受完毕！");

        System.out.println("收到了来自于" + os.getInetAddress().getAddress() + "的连接");

        //关闭socket
        inputStream.close();
        os.close();
        serverSocket.close();


    }




}
