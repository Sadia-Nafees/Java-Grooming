package org.example.oops;

class Vehicle{
    public String brand;
}
class Car extends Vehicle{
    public String color;
}
public class Generalization {
    public static void main(String[] args) {
        Car car=new Car();
        car.color="Grey";
        car.brand="Toyota";
        System.out.println(car.color);
        System.out.println(car.brand);
    }
}
