package com.atguigu04;

public class Product implements Comparable {
    private String name;
    private double price;


    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", price=" + price ;
    }


    /*
    ��ǰ����Ҫʵ�ֳ��󷽷�
    �ڴ˷���������жϵ�ǰ����Ĵ�С
    * */
//    @Override
//    public int compareTo(Object o) {
//        if (o == this){
//            return 0;
//        }
//        if (o instanceof Product){
//            Product p = (Product) o;
//
//            return -Double.compare(this.price,p.price);
//
//        }
//
//        throw new RuntimeException("���Ͳ�ƥ��");
//    }
    //�۸�һ�����Ƚ����ִ�С
    @Override
    public int compareTo(Object o) {
        if(o == this){
            return 0;
        }
        if (o instanceof Product){
            Product pr = (Product) o;

            int v = Double.compare(this.price,pr.price);
            if (v != 0){
                return v;
            }
            return this.name.compareTo(pr.name);
        }

        throw new RuntimeException("���Ͳ�ƥ��");
    }
}
