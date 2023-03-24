package org.example.practice;

class Animal{
    public void eats(){
        System.out.println("Animal is eating");
    }
}
class Cat extends Animal{
    @Override
    public void eats() {
        System.out.println("cat is eating");
    }
    public void walks() {
        System.out.println("cat is walking");
    }
}
public class InheritancePolymorphism {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.eats();
        c.walks();
    }
}
