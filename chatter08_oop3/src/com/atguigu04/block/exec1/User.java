package com.atguigu04.block.exec1;

public class User {
    private String Username;
    private String passwd;
    private long registrationTime;

    public User(){
        System.out.println("���û�ע��");
        this.registrationTime = System.currentTimeMillis();//��ȡ��ǰϵͳʱ��
        Username = System.currentTimeMillis() + "";
        passwd = "123456";
    }

    public User(String Username,String passwd){
        System.out.println("���û�ע��");
        this.registrationTime = System.currentTimeMillis();//��ȡ��ǰϵͳʱ��
        this.Username = Username;
        this.passwd = passwd;

    }

    public String getName() {
        return Username;
    }

    public void setName(String name) {
        this.Username = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public long getRegistrationTime(){
        return registrationTime;
    }
    public String getinfo(){
        return "�û�����" + Username + "���룺" + passwd + "ע��ʱ�䣺" + registrationTime;
    }
}
