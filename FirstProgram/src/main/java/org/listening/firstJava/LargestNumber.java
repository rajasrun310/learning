package org.listening.firstJava;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter the first number : ");

        int first = num.nextInt();

        System.out.print("Enter the second number : ");

        int second = num.nextInt();

        if (first == second) {
            System.out.println("Both the numbers are equal");
        } else if (first > second) {
            System.out.println("Number " + first + " greater than " + second);
        } else {
            System.out.println("Number " + second + " greater than " + first);
        }

    }
}
