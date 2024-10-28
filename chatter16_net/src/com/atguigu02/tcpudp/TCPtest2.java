package com.atguigu02.tcpudp;


//�ͻ��˷����ļ�������ˣ�����˽����ļ�������

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPtest2 {

    @Test
    public void client() throws IOException {
        //1.����socket
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        int port = 8099;
        Socket socket = new Socket(ip,port);
        //2.����File��ʵ����FileInputStreamʵ��
        File file = new File("plx.jpg");
        FileInputStream fls = new FileInputStream(file);
        //3.ͨ��socket��ȡ�����
        OutputStream os = socket.getOutputStream();

        //��д����
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fls.read(bytes)) != -1){
            os.write(bytes,0,len);
        }

        //4.�ر�socket����ص���
        fls.close();
        os.close();
        socket.close();

    }

    @Test
    public void server() throws IOException {

        //1.����server��socket
        int port = 8099;
        ServerSocket serverSocket = new ServerSocket(port);
        //2.���������ڿͻ��˵�socket:accept
        Socket socket = serverSocket.accept();

        //3.ͨ��socket����ȡһ��������
        InputStream inp = socket.getInputStream();

        //4.����Fileʵ��,FileOutputStream
        File file = new File("plx_copy.jpg");
        FileOutputStream fls = new FileOutputStream(file);
        //5.��д����
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inp.read(bytes)) != -1){
            fls.write(bytes,0,len);
        }
        System.out.println("���ݽ������");

        //6.�ر���ص�socket����
        fls.close();
        inp.close();
        socket.close();

    }



}
