
public class EmployeeTest {
    public static void main(String[] args){
        Employee emp1 = new Employee();
        emp1.id = 1;
        emp1.name = "xiaoming";
        emp1.age = 25;
        emp1.salary = 9999.99;
//        emp1.show();
        System.out.println(emp1.show1());
        Employee emp2 = new Employee();

        emp2.show();


    }
}

