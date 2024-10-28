package com.atguigu02.tcpudp;


//客户端发送文件给服务端，服务端接受文件到本地

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPtest2 {

    @Test
    public void client() throws IOException {
        //1.创建socket
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        int port = 8099;
        Socket socket = new Socket(ip,port);
        //2.创建File的实例，FileInputStream实例
        File file = new File("plx.jpg");
        FileInputStream fls = new FileInputStream(file);
        //3.通过socket获取输出流
        OutputStream os = socket.getOutputStream();

        //读写数据
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fls.read(bytes)) != -1){
            os.write(bytes,0,len);
        }

        //4.关闭socket和相关的流
        fls.close();
        os.close();
        socket.close();

    }

    @Test
    public void server() throws IOException {

        //1.创建server的socket
        int port = 8099;
        ServerSocket serverSocket = new ServerSocket(port);
        //2.接受来自于客户端的socket:accept
        Socket socket = serverSocket.accept();

        //3.通过socket来获取一个输入流
        InputStream inp = socket.getInputStream();

        //4.创建File实例,FileOutputStream
        File file = new File("plx_copy.jpg");
        FileOutputStream fls = new FileOutputStream(file);
        //5.读写过程
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inp.read(bytes)) != -1){
            fls.write(bytes,0,len);
        }
        System.out.println("数据接受完毕");

        //6.关闭相关的socket的流
        fls.close();
        inp.close();
        socket.close();

    }



}
