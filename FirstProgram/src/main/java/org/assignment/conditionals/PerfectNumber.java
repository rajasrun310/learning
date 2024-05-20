package org.assignment.conditionals;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scn.nextInt();

        for (int j = 0; j < num; j++) {
            int result = 0;
            for (int i = 1; i <= j/2; i++) {
                if (j % i == 0) {
                    result = result + i;
                }
            }
            if (result == j) {
                System.out.println("Perfect Number " + j);
            }


        }

    }
}
