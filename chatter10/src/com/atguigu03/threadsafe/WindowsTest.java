package com.atguigu03.threadsafe;

class windows2 implements Runnable{
    static int ticket = 100;
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            synchronized(this){
            if(ticket>0){
                try {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                    ticket --;
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }else {
                break;
            }
        }}

    }
}
class windows extends Thread{
    static int ticket = 100;

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            synchronized (windows.class){
            if(ticket>0){
                try {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                    ticket --;
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }else {
                break;
            }
        }}

    }
}


public class WindowsTest {
    public static void main(String[] args) {
        windows w1 = new windows();
        windows w2 = new windows();
        windows w3 = new windows();
        w1.start();
        w2.start();
        w3.start();
//        Thread t1 = new Thread(w1);
//        Thread t2 = new Thread(w1);
//        Thread t3 = new Thread(w1);
//        t1.start();
//        t2.start();
//        t3.start();
//        windows2 w2 = new windows2();
//        Thread t1 = new Thread(w2);
//        Thread t2 = new Thread(w2);
//        Thread t3 = new Thread(w2);
//        t1.start();
//        t2.start();
//        t3.start();



        }





    }

