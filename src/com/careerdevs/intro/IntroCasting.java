package com.careerdevs.intro;

public class IntroCasting {
    public static void main(String[] args) {
        // Implicit casting
        // byte> short > int > long > float > double
        //no chance for data loss
        String x = "1.1";
        double y = Double.parseDouble(x) +2; // 2.0 -- (int)x <-- implicit casting-->
        System.out.println(y);
    }
}
