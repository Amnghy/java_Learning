package com.atguigu06.team.domain;

public class NootBook implements Equipment{

    private String model; //机器的型号
    private double price; //价格

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
