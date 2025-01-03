package com.atguigu03._extends.exer1;

public class Kids extends ManKind{
    private int yearold;

    public Kids() {
    }

    public Kids(int yearold) {
        this.yearold = yearold;
    }

    public Kids(int sex, int salary, int yearold) {
        this.yearold = yearold;
        setSex(sex);
        setSalary(salary);

    }

    public int getYearold() {
        return yearold;
    }

    public void setYearold(int yearold) {
        this.yearold = yearold;
    }

    public void printage(){
        System.out.println("I am yearlod" + yearold);
    }
}
