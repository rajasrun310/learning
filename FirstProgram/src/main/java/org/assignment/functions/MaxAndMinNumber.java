package org.assignment.functions;

import java.util.Scanner;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = scn.nextInt();
        System.out.print("Enter the second number: ");
        int second = scn.nextInt();
        System.out.print("Enter the third number: ");
        int third = scn.nextInt();
        int max = maxNumber(first, second, third);
        System.out.println("the maximum of 3 numbers is : " + max);
        int min = minNumber(first, second, third);
        System.out.println("the minimum of 3 numbers is : " + min);
    }

    /**
     * Find the min number
     *
     * @return int
     */
    private static int minNumber(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        }
        if (third < min) {
            min = third;
        }
        return min;


    }

    /**
     * Find the max number
     *
     * @return int
     */
    private static int maxNumber(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }
        return max;

    }
}
