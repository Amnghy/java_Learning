import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] emps = new Employee[2];

        Scanner scan = new Scanner(System.in);

        for(int i = 0;i< emps.length;i++){
            emps[i] = new Employee();
            System.out.println("----------正在添加第"+(i+1)+"个员工----------");
            System.out.println("姓名:");
            String name = scan.next();
            System.out.println("性别:");
            char gender = scan.next().charAt(0);
            System.out.println("年龄:");
            int age = scan.nextInt();
            System.out.println("电话:");
            String phone = scan.next();

            //给指定的属性赋值

            emps[i].setName(name);
            emps[i].setgender(gender);
            emps[i].setAge(age);
            emps[i].setPhonenumber(phone);

        }
        //遍历列表
        System.out.println("--------------员工列表------------------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话");
        for(int i =0;i < emps.length;i++){
            System.out.println((i+1) +"\t"+ emps[i].getinfo());
        }
        System.out.println("--------------员工完成------------------");
    }
}
