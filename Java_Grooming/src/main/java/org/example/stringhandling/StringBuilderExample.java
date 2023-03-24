package org.example.stringhandling;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("StringBuilder ");
        stringBuilder.append("is ");
        stringBuilder.append("non-synchronized");
        System.out.println(stringBuilder);
    }
}
