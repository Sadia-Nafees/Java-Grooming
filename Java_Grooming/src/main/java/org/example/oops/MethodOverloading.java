package org.example.oops;

class Addition{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.add(2,3));
        System.out.println(addition.add(2,4,6));
    }
}
