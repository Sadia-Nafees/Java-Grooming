package org.example.practice;

public class AddUsingCLA {
    public static void main(String[] args) {
        try{
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int sum= a+b;
            System.out.println(sum);
        }catch (Exception e){
            System.out.println("Add");
        }
    }
}
