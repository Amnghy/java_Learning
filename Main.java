

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Xiao Ming", 15);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
class Hello{
    public void hello(){
        System.out.println("hello world!");
    }
    public void hello(String name){
        System.out.println("hello !"+ name + "!");
    }
    public void hello(String name,int age){
        if (age < 18){
            System.out.println("Hi" + name + "!");
        }else {
            System.out.println("hello"+ name + "!");
        }
    }


}