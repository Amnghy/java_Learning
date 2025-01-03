import java.util.SplittableRandom;

import static java.lang.System.out;
public class Employee {
    int id;

    String name;

    int age;

    double salary;

    //定义一个方法用于现实员工信息

    public void show(){
        System.out.println("id ="+ id + ",name" + name + ",age=" +age + ",salary = " + salary);
    }
    public String show1(){
        return "id ="+ id + ",name" + name + ",age=" +age + ",salary = " + salary;
    }
}
