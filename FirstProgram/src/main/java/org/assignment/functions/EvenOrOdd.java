package org.assignment.functions;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter an number : ");
        int number = scn.nextInt();
        evenOrOdd(number);
    }

    /**
     * if a number is divided by 2 it is even else it is odd
     * @param number Provided by the user
     */
    private static void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else System.out.println("Number is odd");

    }

}
