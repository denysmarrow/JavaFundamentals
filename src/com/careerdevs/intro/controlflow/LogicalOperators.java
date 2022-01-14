package com.careerdevs.intro.controlflow;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println();
    }
}

//&& = and operator
// || = or operator