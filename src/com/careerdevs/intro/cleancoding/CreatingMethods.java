package com.careerdevs.intro.cleancoding;

public class CreatingMethods {
    public static void main(String[] args) {
       String message = greetUser("Mosh", "Hamedani");
        System.out.println(message);

    }

    public static String greetUser(String firstName, String lastName){
        return "Hello " + firstName + " " + lastName;

    }
}
