public class Person_Test {
    public static void main(String[] args){
        Person p1 = new Person();

        p1.name = "tom";
        p1.age = 12;
        p1.gender = '男';

        p1.study();
        p1.addage(2);

        int age = p1.showage();
        System.out.println("age = " + age);


        Person p2 = new Person();

        System.out.println(p2.age);

        p2.addage(12);

        System.out.println(p2.showage());

    }
}
