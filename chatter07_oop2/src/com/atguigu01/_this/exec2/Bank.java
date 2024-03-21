package com.atguigu01._this.exec2;

public class Bank {
    private Customer[] customers; //用于保存多个客户
    private int numberOfCustomer; //用于保存记录存储的客户的个数

    public Bank(){
        customers = new Customer[10];
    }

    /**
     * 将指定姓名的客户保存在银行的客户列表中
     * @param f
     * @param l
     */
    public void addCustomer(String f,String l){
        Customer cust = new Customer(f,l);
        customers[numberOfCustomer++] = cust;
    }

    /**
     * 获取客户列表中的个数
     * @return
     */
    public int getNumOfCustomers(){
        return numberOfCustomer;
    }

    /**
     * 获取指定客户的数据
     * @param index
     * @return
     */
    public Customer getCustomer(int index){
        if(index < 0 || index >= numberOfCustomer){
            return null;
        }
        return customers[index];
    }




}
