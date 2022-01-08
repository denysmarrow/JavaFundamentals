package com.careerdevs.intro;

import java.awt.*;

public class primitiveVsReferenceTypes {
    public static void main(String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        // referencing the same object
        point1.x = 2;
        System.out.println(point2);

    }
}
