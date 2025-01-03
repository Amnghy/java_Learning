
public class Person {
    private int age;


    //设置AGE属性

    public void setAge(int a){
        if (a >= 0 && a<= 130){
            age = a;
        }else{
            System.out.println("你输入的数据非法");
        }
    }

    public int getAge(){
        return age;
    }
}
