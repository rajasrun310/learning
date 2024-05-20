package org.assignment.functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = scn.nextInt();
        int fact = factorial(number);
        System.out.println(" The factorial of " + number + " is " + fact);
    }

    /**
     * To factorial of a number multiplication from 1 to the number it-self
     * Ex : 5! = 1*2*3*4*5
     * @param number provided by the user
     * @return integer
     */
    private static int factorial(int number) {
        int result = 1;
        if (number == 0 || number == 1) {
            System.out.println("The factorial is " + result);
        } else {
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
        }
        return result;
    }
}