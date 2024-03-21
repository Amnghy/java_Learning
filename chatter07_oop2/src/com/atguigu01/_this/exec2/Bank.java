package com.atguigu01._this.exec2;

public class Bank {
    private Customer[] customers; //���ڱ������ͻ�
    private int numberOfCustomer; //���ڱ����¼�洢�Ŀͻ��ĸ���

    public Bank(){
        customers = new Customer[10];
    }

    /**
     * ��ָ�������Ŀͻ����������еĿͻ��б���
     * @param f
     * @param l
     */
    public void addCustomer(String f,String l){
        Customer cust = new Customer(f,l);
        customers[numberOfCustomer++] = cust;
    }

    /**
     * ��ȡ�ͻ��б��еĸ���
     * @return
     */
    public int getNumOfCustomers(){
        return numberOfCustomer;
    }

    /**
     * ��ȡָ���ͻ�������
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
