package com.company;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Mortgage {

    private static DecimalFormat df2 = new DecimalFormat(".##");

    public static void main(String[] args) {

        double mortgageAmount;
        double percentageRate;
        double paymentTerm;
        double monthlyPayment;
        String status = "";
        String parameter = "";


        Scanner input = new Scanner(System.in);

        System.out.println("Simple Mortgage Calculator");

        System.out.println("Enter the Loan Amount: ");
        mortgageAmount = input.nextDouble();
        System.out.println("Mortgage Amount is: $" + df2.format(mortgageAmount));

        System.out.println("Enter the Annual Percentage Rate (in percentage): ");
        percentageRate = input.nextDouble();
        System.out.println("Interest Rate is: " + percentageRate + "%");
        double monthlyRate = (percentageRate / 100) / 12;

        System.out.println("Enter the Payment Term Length (in years): ");
        paymentTerm = input.nextDouble();
        System.out.println("Payment Term Length (in years) is: " + paymentTerm);
        double months = paymentTerm * 12;

        monthlyPayment = mortgageAmount * (monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Monthly Payments expected to be: " + df2.format(monthlyPayment));

    }

}
