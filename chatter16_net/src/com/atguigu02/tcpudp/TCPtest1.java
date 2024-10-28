package com.atguigu02.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;



/*
* �ͻ��˷������ݸ�����ˣ�����˽����ݴ�ӡ������̨��
* */


public class TCPtest1 {

    /* �ͻ��� */
    @Test
    public void client() throws IOException {
        //����socket
//        InetAddress inetAddress = new InetAddress.getByName("127.0.0.1");
        int port = 8089;
        Socket socket = new Socket("127.0.0.1",port);
        //��������
        OutputStream os = socket.getOutputStream();
        os.write("��ã���������".getBytes("GB2312"));

        //�ر�socket
        os.close();
        socket.close();
    }

    /* ����� */
    @Test
    public void service() throws IOException {

        //����һ��sockerserver
        int port = 8089;
        ServerSocket serverSocket = new ServerSocket(port);
        //����accept()�����տͻ�������
        Socket os =  serverSocket.accept();

        //��������
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

        System.out.println("���ݽ�����ϣ�");

        System.out.println("�յ���������" + os.getInetAddress().getAddress() + "������");

        //�ر�socket
        inputStream.close();
        os.close();
        serverSocket.close();


    }




}
