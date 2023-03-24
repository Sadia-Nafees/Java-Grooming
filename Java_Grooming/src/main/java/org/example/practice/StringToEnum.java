package org.example.practice;

public class StringToEnum {
    private enum Rainbow{
        Violet,Indigo,Blue,Green,Yellow,Orange,Red;
    }
    public static void main(String[] args) {
        String color="Indigo";
        Enum rainbow=Enum.valueOf(Rainbow.class,color);
        Rainbow.valueOf(color);
        System.out.println(rainbow);
    }
}
