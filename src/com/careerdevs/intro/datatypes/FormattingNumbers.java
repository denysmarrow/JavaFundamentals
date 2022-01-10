package com.careerdevs.intro.datatypes;

import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
//        NumberFormat.getPercentInstance().format(0.1); //method chaining
        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);

    }
}

//public class FormattingNumbers {
//    public static void main(String[] args) {
//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result = percent.format(0.1);
//        System.out.println(result);
//
//    }
//}
