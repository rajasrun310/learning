package org.listening.firstJava;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number to see FibonacciSeries up to ");

        int series = scn.nextInt();

        int firstTerm = 0, secondTerm = 1;


        for (int i = 1; i <= series; ++i) {
            System.out.print(firstTerm + ",");

            int nextTerm = firstTerm + secondTerm;

            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }

    }


}
