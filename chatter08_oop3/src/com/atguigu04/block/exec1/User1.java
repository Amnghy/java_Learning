package com.atguigu04.block.exec1;

public class User1 {
    private String Username;
    private String passwd;
    private long registrationTime;

    {
        System.out.println("���û�ע��");
        this.registrationTime = System.currentTimeMillis();//��ȡ��ǰϵͳʱ��

    }

    public User1(){
        Username = System.currentTimeMillis() + "";
        passwd = "123456";
    }

    public User1(String Username,String passwd){
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
