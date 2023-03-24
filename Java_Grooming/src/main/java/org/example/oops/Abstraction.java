package org.example.oops;

abstract class Sports{
    public abstract void watch();
    public void play(){
        System.out.println("I love playing Cricket");
    }
}
class Cricket extends Sports{
    @Override
    public void watch() {
        System.out.println("I love watching cricket");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Cricket ipl=new Cricket();
        ipl.watch();
        ipl.play();
    }
}
