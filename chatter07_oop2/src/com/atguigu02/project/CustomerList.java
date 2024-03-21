package com.atguigu02.project;

/*
CustomerList 为Customer管理模块
 */
public class CustomerList {
    private Customer[] Customers; //用来保存客户对象的数组
    private int total; //用于记录已经保存客户的数量


    public CustomerList(int totalCustomer){
        Customers = new Customer[totalCustomer];
    }
    public boolean addCustomer(Customer customer){
        if(total < Customers.length){
            Customers[total++] = customer;
            return true;
        }
        return false;

    }

    /**
     *
     * @param index
     * @param cust
     * @return
     */
    public boolean replaceCustomer(int index,Customer cust){
        if(index >= 0 && index < total){
            Customers[index] = cust;
            return true;
        }
        return false;
    }

    public boolean delCUSTOMER(int index){
        if(index < 0 || index >= total){
            return false;
        }
        for(int i = index;i < total -1;i++){
            Customers[i] = Customers[i+1];
        }
        Customers[--total-1] = null;
        return true;
    }
//获取记录中的客户对象
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for(int i=0;i < custs.length;i++){
            custs[i] = Customers[i];
        }
        return custs;
    }

    public Customer getCustomer(int index){
        if(index < 0 && index >= total){
            return null;
        }
        return Customers[index];
    }

    public int getTotal(){
        return total;
    }




}
