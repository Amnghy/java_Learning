package com.atguigu.String.exer3;


import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        User[] arr = new User[3];
        arr[0] = new User("amt","123456");
        arr[1] = new User("sss","888976");
        arr[2] = new User("max","333666");

        System.out.println("���е��û����У�");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getUsername()+"-"+arr[i].getPassword());
        }


        Scanner sc = new Scanner(System.in);

        System.out.print("�������û�����");
        String username = sc.next();
        System.out.print("���������룺");
        String password = sc.next();
        sc.close();


        Boolean isFlag = true;
        for(int i=0;i < arr.length;i++){
            if (username.equals(arr[i].getUsername())){
                isFlag = false;
                if(password.equals(arr[i].getPassword())){
                    System.out.println("��¼�ɹ�," + username);
                    break;
                }else {
                    System.out.println("��������");
                    break;
                }
            }
        }

        if(isFlag){
            System.out.println("û�и��û�");
        }




    }
}
