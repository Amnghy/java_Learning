package com.atguigu02.method_lifecycle;


class PrintNumber implements Runnable{


    @Override
    public void run() {
        Thread.currentThread().setName("线程1");
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

class PrintNumbett extends Thread{


    @Override
    public void run() {
        Thread.currentThread().setName("线程2");
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            if(i % 20 == 0){
                Thread.yield();
            }
        }
    }
}


public class EvenNumberTest {
    public static void main(String[] args) {
        PrintNumber p1 = new PrintNumber();
        Thread t1 = new Thread(p1);
        t1.start();

        PrintNumbett t2 = new PrintNumbett();
        t2.start();

        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            if (i == 20){
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }




    }
}

