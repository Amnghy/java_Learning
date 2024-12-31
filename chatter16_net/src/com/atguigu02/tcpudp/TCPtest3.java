package com.atguigu02.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;


//�ͻ��˷����ļ�������ˣ�����˱��浽���أ�Ȼ�����˷��ط��ͳɹ����ͻ��ˡ����ر���Ӧ������
public class TCPtest3 {
    @Test
    public void client() throws IOException{
        //1.����socket
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        int port = 8099;
        Socket socket = new Socket(ip,port);
        //2.����File��ʵ����FileInputStreamʵ��
        File file = new File("55313851.pdf");
        FileInputStream fls = new FileInputStream(file);
        //3.ͨ��socket��ȡ�����
        OutputStream os = socket.getOutputStream();

        //��д����
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fls.read(bytes)) != -1){
            os.write(bytes,0,len);
        }
        System.out.println("������ϣ�");
        socket.shutdownOutput();

        InputStream os2 = socket.getInputStream();
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        byte[] buff = new byte[5];
        while ((len = os2.read(buff)) != -1){
            bao.write(buff,0,len);
        }

        System.out.println(bao.toString());

        //4.�ر�socket����ص���
        bao.close();
        os2.close();
        fls.close();
        os.close();
        socket.close();
    }


    @Test
    public void server() throws IOException{

        //1.����server��socket
        int port = 8099;
        ServerSocket serverSocket = new ServerSocket(port);
        //2.���������ڿͻ��˵�socket:accept
        Socket socket = serverSocket.accept();

        //3.ͨ��socket����ȡһ��������
        InputStream inp = socket.getInputStream();

        //4.����Fileʵ��,FileOutputStream
        File file = new File("55313851_copy.pdf");
        FileOutputStream fls = new FileOutputStream(file);
        //5.��д����
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inp.read(bytes)) != -1){
            fls.write(bytes,0,len);
        }
        System.out.println("���ݽ������");

        //����˷�����Ϣ���ͻ���
        OutputStream os = socket.getOutputStream();
        os.write("ͼƬ���յ�".getBytes("GB2312"));


        //6.�ر���ص�socket����
        os.close();
        fls.close();
        inp.close();
        socket.close();

    }

}
