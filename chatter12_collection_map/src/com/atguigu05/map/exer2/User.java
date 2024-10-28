package com.atguigu05.map.exer2;

public class User implements Comparable {
    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        if(o instanceof User){
            User u1 = (User) o;
            int value = this.name.compareTo(u1.getName());
            if (value != 0){
                return value;
            }
            return this.age - u1.getAge();
        }
        throw  new RuntimeException("¿‡–Õ≤ª∆•≈‰");
    }
}
