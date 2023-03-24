package org.example.oops;
//Encapsulation
public class Student{
    private String name;
    private String rollno;

    public String getName(){ return name; }
    public void setName(String name){ this.name=name; }
    public String getRollno(){ return rollno; }
    public void setRollno(String rollno){ this.rollno=rollno; }
}
 class Encapsulation {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("Harry");
        s1.setRollno("21");
        System.out.println(s1.getName());
        System.out.println(s1.getRollno());
    }
}
