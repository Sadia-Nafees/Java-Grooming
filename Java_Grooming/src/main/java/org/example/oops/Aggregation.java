package org.example.oops;

class Calculate{
    int calculateArea(int length,int breadth){
        return (length*breadth);
    }
}
class Rectangle{
    Calculate calculate;
    int area(int length, int breadth){
        calculate=new Calculate();
        int rectangleArea=calculate.calculateArea(length,breadth);
        return rectangleArea;
    }
}
public class Aggregation {
    public static void main(String[] args) {
        Rectangle rec=new Rectangle();
        int areaRectangle= rec.area(30,22);
        System.out.println(areaRectangle);
    }
}
