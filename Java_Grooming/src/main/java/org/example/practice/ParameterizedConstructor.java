package org.example.practice;

class Student{
    String name;
    int rollno;
    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student s=new Student("Sophie",20);
        s.display();
    }
}
