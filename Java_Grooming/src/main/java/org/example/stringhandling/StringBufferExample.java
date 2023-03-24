package org.example.stringhandling;

public class StringBufferExample { //synchronized-two threads cannot call the methods simultaneously
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("String ");
        stringBuffer.append("Buffer");
        stringBuffer.insert(0,"is mutable ");
        System.out.println(stringBuffer);
    }
}
