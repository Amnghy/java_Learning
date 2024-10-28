package com.atguigu06.team.domain;

public class NootBook implements Equipment{

    private String model; //�������ͺ�
    private double price; //�۸�

    public NootBook() {
    }

    public NootBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }
}
