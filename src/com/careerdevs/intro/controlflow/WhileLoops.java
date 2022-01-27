package com.careerdevs.intro.controlflow;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        String input = "";
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }
}
