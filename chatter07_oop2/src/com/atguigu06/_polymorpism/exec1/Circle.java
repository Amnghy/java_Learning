package com.atguigu06._polymorpism.exec1;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(String color,double weight,double radius){
        super(color,weight);
        this.radius = radius;
    }


    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    @Override
    public double findArea() {
        return 3.14 * radius * radius;
    }
}
