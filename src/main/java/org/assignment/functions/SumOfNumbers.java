package org.assignment.functions;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scn.nextInt();
        sumOfNumbers(number);
    }

    private static void sumOfNumbers(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        System.out.println("The sum of first " + number + " is " + result);
    }
}
