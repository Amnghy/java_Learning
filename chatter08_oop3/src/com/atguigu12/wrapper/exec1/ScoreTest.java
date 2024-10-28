package com.atguigu12.wrapper.exec1;


import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
    public static void main(String[] args) {
        Vector v = new Vector();

        Scanner scanner = new Scanner(System.in);

        int maxscore = 0;


        while (true){
            System.out.print("请输入学生成绩:");
            int IntScore = scanner.nextInt();

            if(IntScore < 0){
                break;
            }
//            Integer Score = Integer.valueOf(IntScore);
//            v.addElement(Score);
            v.addElement(IntScore);


            if(maxscore < IntScore){
                maxscore = IntScore;
            }






        }
        System.out.println("最高分是:"+maxscore);
        for (int i = 0; i < v.size(); i++) {
            Object o = v.elementAt(i);
//            Integer integerScore = (Integer) o;
//            //拆箱
//            int Score = integerScore.intValue();
            int Score = (Integer) o;

            char grade;
            if(maxscore - Score <= 10){
                grade = 'A';
            } else if (maxscore - Score <=20) {
                grade = 'B';
            } else if (maxscore - Score <= 30) {
                grade = 'C';
            }else {
                grade = 'D';
            }


            System.out.println("Student "+i+"Score is "+Score+"grade is "+grade);

        }





        scanner.close();
    }
}
