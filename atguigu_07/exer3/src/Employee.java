
public class Employee {
    private String name;
    private char gender;
    private int age;
    private String Phonenumber;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setgender(char s){
        gender = s;
    }
    public char getdender(){
        return gender;
    }
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
    public void setPhonenumber(String p){
        Phonenumber = p;
    }
    public String getPhonenumber(){
        return Phonenumber;
    }
    public String getinfo(){
        return name + "\t" + gender + "\t" + age+ "\t" + Phonenumber;
    }
}
