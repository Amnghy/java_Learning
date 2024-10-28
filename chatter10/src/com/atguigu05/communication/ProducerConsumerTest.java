package com.atguigu05.communication;



class Clerk { //店员
    private int productNum = 0;//生产数量

    public synchronized void addProduct() {//增加生产数量
        if (productNum >= 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
        productNum++;
        System.out.println(Thread.currentThread().getName() + "生产了第" + productNum + "个产品");
        notifyAll();
    }}

    public synchronized void minusProduct() {//减少生产数量
        if (productNum <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {

        System.out.println(Thread.currentThread().getName() + "消费了第" + productNum + "个产品");
        productNum--;
        notifyAll();
    }}

}

class Producer extends Thread{//生产者

    private Clerk clerk;

    public Producer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("生成者开始生成产品");
        while (true){

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.addProduct();
        }


    }
}

class Consumer extends Thread{//消费者

    private Clerk clerk;

    public Consumer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("消费者开始消费产品");
        while (true){

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.minusProduct();
        }


    }
}






public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk);
        Consumer c1 = new Consumer(clerk);
        Consumer c2 = new Consumer(clerk);

        p1.setName("生产者1");
        c1.setName("消费者1");
        c2.setName("消费者1");

        p1.start();
        c1.start();
        c2.start();

    }
}
