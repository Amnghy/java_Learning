package com.atguigu06.team.domain;

public class Employee {
    private int ID;
    private String name;
    private int age;
    private double salary;


    public Employee() {
    }

    public Employee(int ID, String name, int age, double salary) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    protected String getDetails(){
        return ID + "\t" + name + "\t" + age + "\t" + salary;
    }

    @Override
    public String toString() {
        return getDetails();
    }
}
