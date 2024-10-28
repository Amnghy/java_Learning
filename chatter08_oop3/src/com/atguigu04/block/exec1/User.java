package com.atguigu04.block.exec1;

public class User {
    private String Username;
    private String passwd;
    private long registrationTime;

    public User(){
        System.out.println("新用户注册");
        this.registrationTime = System.currentTimeMillis();//获取当前系统时间
        Username = System.currentTimeMillis() + "";
        passwd = "123456";
    }

    public User(String Username,String passwd){
        System.out.println("新用户注册");
        this.registrationTime = System.currentTimeMillis();//获取当前系统时间
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
        return "用户名：" + Username + "密码：" + passwd + "注册时间：" + registrationTime;
    }
}
