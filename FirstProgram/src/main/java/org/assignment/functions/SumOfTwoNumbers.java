package org.assignment.functions;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = scn.nextInt();

        System.out.print("Enter the Second number: ");
        int second = scn.nextInt();

        sum(first, second);

    }

    private static void sum(int a, int b) {
        System.out.println("The sum of two numbers is : " + (a + b));

    }
}
