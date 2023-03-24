package org.example.oops;

class Person{
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

class Engineer extends Person{
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Engineer engineer=new Engineer();
        engineer.setName("Sophie Devine");
        engineer.setAge(30);
        System.out.println(engineer.getName());
        System.out.println(engineer.getAge());
    }
}
