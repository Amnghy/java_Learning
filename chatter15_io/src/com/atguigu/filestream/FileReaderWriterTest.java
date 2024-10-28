package com.atguigu.filestream;

import org.junit.Test;

import java.io.*;

public class FileReaderWriterTest {
    /*
    ��ȡhello.txt���ݣ������
    */


    @Test
    public void test() throws IOException {
        //1.����file����
        File file = new File("hello.txt");
        //2.
        FileReader fr = new FileReader(file);
        //3.
//        int data = fr.read();
//        while (data != -1){
//            System.out.print((char) data);
//            data = fr.read();
//        }
        int data;
        while ((data = fr.read()) != -1){
            System.out.print((char) data);
        }
        //4.�ر�
        fr.close();
    }
    /*
    ʹ��try-cach�ķ�ʽ
     */

    @Test
    public void test2(){
        //1.����file����
        FileReader fr = null;
        try{
        File file = new File("hello.txt");
        //2.
        fr = new FileReader(file);
        //3.
//        int data = fr.read();
//        while (data != -1){
//            System.out.print((char) data);
//            data = fr.read();
//        }
        int data;
        while ((data = fr.read()) != -1){
            System.out.print((char) data);
        }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                //4.�ر�
                if(fr != null){
                fr.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }


    @Test
    public void test3(){
        //1.����file����
        FileReader fr = null;
        try{
            File file = new File("hello.txt");
            //2.
            fr = new FileReader(file);
            //3.
//        int data = fr.read();
//        while (data != -1){
//            System.out.print((char) data);
//            data = fr.read();
//        }
            char[] chars = new char[3];
            int len;

            //������������д��
            while ((len = fr.read(chars)) != -1){
                for (int i = 0; i < chars.length;i++) {
                    System.out.print(chars[i]);
                }

            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                //4.�ر�
                if(fr != null){
                    fr.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    /*
    ���ڴ��е�����д�뵽�µ��ļ���
     */
    @Test
    public void test4(){
        FileWriter fw = null;
        try {
            //����file�����
            File file = new File("hello.txt");
            //
            fw = new FileWriter(file,true);

            fw.write("I LOVE U\n");

            fw.write("You LOVE Him\n");
            fw.write("̫����\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(fw != null){
                try {
                    fw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }


    /*
��hello.txt�ļ����ݸ��Ƶ�hello_copy.txt�ļ�
 */
    @Test
    public void test5(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //����file�����
            File file = new File("hello.txt");
            File file2 = new File("hello_copy.txt");

            //

            fr = new FileReader(file);
            fw = new FileWriter(file2,false);

            //�ȶ���д��
            char[] chars = new char[5];
            int len;
            while ((len = fr.read(chars)) != -1){
                fw.write(chars,0,len);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(fw != null){
                try {
                    fw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(fr != null){
                try {
                    fr.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

}
