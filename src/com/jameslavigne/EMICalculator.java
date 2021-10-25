package com.jameslavigne;

import java.util.Scanner;

public class EMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //get input from user
        System.out.println("Enter the Loan Amount:");
        double p = scanner.nextDouble();
        System.out.println("Enter the Rate of Interest:");
        double r = scanner.nextDouble();
        System.out.println("Enter the Tenure:");
        int n = scanner.nextInt();

        //calculate EMI
        double emi = p * r * (Math.pow(1 + r, n) / (Math.pow(1 + r, n) - 1));
        System.out.println("EMI: " + emi);
    }
}
