package org.example.stringhandling;

public class StringExample {
    public static void main(String[] args) {
        String s1=new String("String");
        String s2="String";
        String s3="Handling";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.concat(s3));
        System.out.println(s1.equals(s2));
        System.out.println(s1.charAt(1));
        System.out.println(s1.contains(s2));
        System.out.println(s3.endsWith("g"));
        System.out.println(s3.indexOf("i"));
        System.out.println(s3.toUpperCase());
        System.out.println(s3.length());
    }
}
