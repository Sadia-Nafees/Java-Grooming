package org.example.javabasics;

final class Person{
    private final String name;
    public Person(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class ImmutableClassExample { //no setter;variables,class- final
    public static void main(String[] args) {
        Person person=new Person("Joe");
        String s= person.getName();
        System.out.println("Name: "+s);
    }
}
