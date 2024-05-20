package org.assignment.conditionals;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scn.nextInt();
        int result = 1;

        if (number == 0) {
            System.out.println("The factorial of number is : 1");
        } else {
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
            System.out.println("The factorial of " + number + " number is : " + result);
        }
    }
}
