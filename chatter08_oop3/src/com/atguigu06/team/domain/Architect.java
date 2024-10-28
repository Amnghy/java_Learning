package com.atguigu06.team.domain;

public class Architect extends Designer{
    private int stock;//¹ÉÆ±

    public Architect() {
    }

    public Architect(int ID, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(ID, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetails() + "\t¼Ü¹¹Ê¦\t" + getStatus() + "\t"+ getBonus() + "\t"+getStock()+"\t\t" + getEquipment().getDescription();
    }
}
