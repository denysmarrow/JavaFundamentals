package com.careerdevs.intro;

public class primitiveVsReferenceTypes {
    public static void main(String[] args) {
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

    }
}
