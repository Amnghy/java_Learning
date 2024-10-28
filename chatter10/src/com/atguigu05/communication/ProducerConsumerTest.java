package com.atguigu05.communication;



class Clerk { //��Ա
    private int productNum = 0;//��������

    public synchronized void addProduct() {//������������
        if (productNum >= 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
        productNum++;
        System.out.println(Thread.currentThread().getName() + "�����˵�" + productNum + "����Ʒ");
        notifyAll();
    }}

    public synchronized void minusProduct() {//������������
        if (productNum <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {

        System.out.println(Thread.currentThread().getName() + "�����˵�" + productNum + "����Ʒ");
        productNum--;
        notifyAll();
    }}

}

class Producer extends Thread{//������

    private Clerk clerk;

    public Producer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("�����߿�ʼ���ɲ�Ʒ");
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

class Consumer extends Thread{//������

    private Clerk clerk;

    public Consumer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("�����߿�ʼ���Ѳ�Ʒ");
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

        p1.setName("������1");
        c1.setName("������1");
        c2.setName("������1");

        p1.start();
        c1.start();
        c2.start();

    }
}
