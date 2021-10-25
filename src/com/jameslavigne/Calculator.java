package com.jameslavigne;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //get input

        //first input
        System.out.println("Enter the First Number:");
        double first = 0;
        try {
            first = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Not a valid first number");
            System.exit(0);
        }

        //second input
        System.out.println("Enter the Second Number:");
        double second = 0;
        try {
            second = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Not a valid second number");
            System.exit(0);
        }

        //select operation
        System.out.println("Select Option:");
        System.out.println("1 - Add");
        System.out.println("2- Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");

        int oper;
        boolean validOper = false;

        do {
            oper = scanner.nextInt();
            if (oper > 0 && oper < 5) {
                validOper = true;
            } else {
                System.out.println("Enter a valid input for operation (1-4).");
            }
        } while (!validOper);

        System.out.print("Result: ");

        //perform operation
        switch (oper) {
            case 1:
                System.out.println(first + second);
                break;
            case 2:
                System.out.println(first - second);
                break;
            case 3:
                System.out.println(first * second);
                break;
            case 4:
                try {
                    System.out.println(first / second);
                } catch (Exception e) {
                    System.out.println("Error dividing numbers.");
                }
                break;
            default:
                System.out.println("Error performing operation");
        }
    }
}
