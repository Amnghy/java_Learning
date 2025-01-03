package com.atguigu07._abstract.exec2;

public class SalariedEmployee extends Employee{

    private double monthlySalary;//ÔÂ¹¤×Ê

    public SalariedEmployee() {
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }


//    public double getMonthlySalary() {
//        return monthlySalary;
//    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String toString(){
        return "SalariedEmployee [" + super.toString() + "]";
    }




}
