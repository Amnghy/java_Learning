package com.atguigu05.communication;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class NumberThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}


class NumberThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}





public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService server = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor server1 = (ThreadPoolExecutor) server;

        server1.setMaximumPoolSize(50);


        server.execute(new NumberThread());
        server.execute(new NumberThread2());


        server.shutdown();


    }
}
