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
    当前类需要实现抽象方法
    在此方法中如何判断当前对象的大小
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
//        throw new RuntimeException("类型不匹配");
//    }
    //价格一样，比较名字大小
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

        throw new RuntimeException("类型不匹配");
    }
}
