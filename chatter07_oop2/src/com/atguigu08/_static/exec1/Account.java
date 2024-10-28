package com.atguigu08._static.exec1;

public class Account {
    private int id;
    private String passwd;
    private double blance;
    private static double interestRate=0.023;

    private static double minBlance = 1.0;//最小余额

    private static int init = 1001; //用于自动生成ID


    public Account(){
        this.id = init;
        init++;
        this.passwd = "000000";
    }
    public Account(String passwd,double blance){
        this.passwd = passwd;
        this.blance = blance;
        this.id = init;
        init++;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public double getBlance() {
        return blance;
    }

    public void setBlance(double blance) {
        this.blance = blance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinBlance() {
        return minBlance;
    }

    public static void setMinBlance(double minBlance) {
        Account.minBlance = minBlance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", passwd='" + passwd + '\'' +
                ", blance=" + blance +
                '}';
    }
}
