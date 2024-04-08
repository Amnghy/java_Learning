public class Person {
    String name;
    int age;
    char gender;

    public void study(){
        System.out.println(name +"studing");
    }
    public int showage(){
        return age;
    }
    public char getGender(){
        return gender;
    }
    public void addage(int addage){
        age += addage;
    }

}
