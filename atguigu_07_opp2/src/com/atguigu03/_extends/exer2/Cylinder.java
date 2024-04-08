package com.atguigu03._extends.exer2;

public class Cylinder extends Circle{
    private double length;

    public Cylinder() {
        this.length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //求圆柱的体积
    public double findVolume(){
        return 3.14 * getRadius() * getRadius() * getLength();
//        return findArea() * getLength();
    }
}
