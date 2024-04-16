package com.atguigu06._polymorpism.exec1;

public class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public MyRectangle(String color,double weight,double width,double height){
        super(color,weight);
        this.width = width;
        this.height = height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getWidth(){
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public double findArea() {

        return width * height;
    }
}
