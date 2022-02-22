package com.careerdevs.intro.projects;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
//        final byte MONTHS_IN_YEAR = 12;
//        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Annual Interest Rate ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.println("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                    * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                    / (Math.pow(1 + monthlyInterest, numberOfPayments)-1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
        public static double calculateBalance(int principal, float annualInterest, byte years, short numberOfPaymentsMade){


            float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
            int numberOfPayments = years * MONTHS_IN_YEAR;

            double balance = principal * (Math.pow(1 + monthlyInterest, numberOfPayments) -(Math.pow(1 + monthlyInterest, numberOfPaymentsMade )) / (Math.pow(1 + monthlyInterest, numberOfPayments)) );

            return balance;



        }



}
