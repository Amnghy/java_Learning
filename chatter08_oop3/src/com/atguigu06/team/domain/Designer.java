package com.atguigu06.team.domain;

public class Designer extends Programmer{
    private double bonus;

    public Designer() {
    }

    public Designer(int ID, String name, int age, double salary, Equipment equipment, double bonus) {
        super(ID, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public String toString() {
        return getDetails() + "\t…Ëº∆ ¶\t" + getStatus() + "\t"+ getBonus() + "\t\t\t\t" + getEquipment().getDescription();
    }
}
