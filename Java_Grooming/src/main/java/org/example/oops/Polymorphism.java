package org.example.oops;
//Method Overriding
class Animal{
    public void walks(){
        System.out.println("Animal is walking");
    }
}
class Cat extends Animal{
    @Override
    public void walks() {
        System.out.println("Cat is walking");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Cat cat= new Cat();
        cat.walks();
    }
}
