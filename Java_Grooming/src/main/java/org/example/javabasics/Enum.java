package org.example.javabasics;

enum Rainbow{
    Violet,Indigo,Blue,Green,Yellow,Orange,Red;
}
public class Enum {
    public static void main(String[] args) {
        Rainbow rainbow=Rainbow.Red;
        switch (rainbow){
            case Violet:
                System.out.println("Violet");
                break;
            case Indigo:
                System.out.println("Indigo");
                break;
            case Blue:
                System.out.println("Blue");
                break;
            case Green:
                System.out.println("Green");
                break;
            case Yellow:
                System.out.println("Yellow");
                break;
            case Orange:
                System.out.println("Orange");
                break;
            case Red:
                System.out.println("Red");
                break;
            default:
                System.out.println("Not a rainbow color");
        }
    }
}
